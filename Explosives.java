import java.util.List;
import java.util.ArrayList;
// Based on a B specification from Marie-Laure Potet.

public class Explosives {

    public int nb_inc = 0;
    public String [][] incomp = new String[50][2];
    public int nb_assign = 0;
    public String [][] assign = new String[30][2];

    // Prop 1 : verifie que nb_inc ne depasse jamais la taille du tableau incomp (50)
    /*@ public invariant
      @ (0 <= nb_inc && nb_inc < 50);
      @*/

    // Prop 2 : verifie que nb_assign ne depasse jamais la taille du tableau assign (30)
    /*@ public invariant
      @ (0 <= nb_assign && nb_assign < 30);
      @*/

    // Prop 3 : verifie que le tableau incomp ne contient que des paires de chaines commençant par "Prod" (des produits)
    /*@ public invariant
      @ (\forall int i; 0 <= i && i < nb_inc;
      @     incomp[i][0].startsWith("Prod") && incomp[i][1].startsWith("Prod"));
      @*/

    // Prop 4 : verifie que le tableau assign ne contient que des paires de chaines commençant par "Bat" et "Prod" (batiment, produit)
    /*@ public invariant
      @ (\forall int i; 0 <= i && i < nb_assign;
      @     assign[i][0].startsWith("Bat") && assign[i][1].startsWith("Prod"));
      @*/

    // Prop 5 : 
    /*@ public invariant
      @ (\forall int i; 0 <= i && i < nb_inc;
      @     !(incomp[i][0]).equals(incomp[i][1]));
      @*/

    // Prop 6 : 
    /*@ public invariant
      @ (\forall int i; 0 <= i && i < nb_inc;
      @     (\exists int j; 0 <= j && j < nb_inc;
      @         (incomp[i][0]).equals(incomp[j][1])
      @         && (incomp[j][0]).equals(incomp[i][1])));
      @*/

    // Prop 7 : 
    /*@ public invariant
      @ (\forall int i; 0 <= i &&  i < nb_assign; 
      @     (\forall int j; 0 <= j && j < nb_assign; 
      @         (i != j && (assign[i][0]).equals(assign [j][0])) ==>
      @         (\forall int k; 0 <= k && k < nb_inc;
      @             (!(assign[i][1]).equals(incomp[k][0])) 
      @             || (!(assign[j][1]).equals(incomp[k][1])))));
      @*/

    // precond prop 1
    //@ requires (nb_inc < (50 - 2));
    // precond prop 3
    //@ requires (prod1.startsWith("Prod") && prod2.startsWith("Prod"));
    // precond prop 5
    //@ requires (!prod1.equals(prod2));
    // add precond prop 7
    public void add_incomp(String prod1, String prod2) {
        incomp[nb_inc][0] = prod1;
        incomp[nb_inc][1] = prod2;
        incomp[nb_inc + 1][1] = prod1;
        incomp[nb_inc + 1][0] = prod2;
        nb_inc = nb_inc + 2;
    }

    // precond prop 2
    //@ requires (nb_assign < (30 - 1));
    // precond prop 4
    //@ requires (bat.startsWith("Bat") && prod.startsWith("Prod"));
    // add precond prop 7
    public void add_assign(String bat, String prod) {
        assign[nb_assign][0] = bat;
        assign[nb_assign][1] = prod;
        nb_assign = nb_assign + 1;
    }

    //@ requires (prod1.startsWith("Prod") && prod2.startsWith("Prod"));
    // remplacer par une condition existentielle
    //@ requires prodExists(prod1);
    //@ requires prodExists(prod2);
    public boolean compatible(String prod1, String prod2) {
        int i = 0;
        boolean compatible = true;
        while(compatible && i < nb_inc) {
            if((incomp[i][0].equals(prod1) && incomp[i][1].equals(prod2))
                || (incomp[i][1].equals(prod1) && incomp[i][0].equals(prod2))) {
                compatible = false;
            }
            i++;
        }
        return compatible;
    }

    //@ requires prod.startsWith("Prod");
    public String findBat(String prod) {
        List bats = getBats();
        int i = 0;
        while(i < bats.size()) {
            List prods = getProds(((String)bats.get(i)));
            int j = 0;
            boolean compatible = true;
            while(compatible && j < prods.size()) {
                compatible = compatible(prod, ((String)prods.get(j)));
                j++;
            }
            if(compatible) {
                return ((String)bats.get(i));
            }
            i++;
        }
        return "new";
    }

    public String findBatTrivial(String prod) {
        return "new";
    }
    /*@ ensures
    @ (\exists int i; 0 <= i && i < nb_inc;
    @ ! (incomp[i][0].equals(prod) || incomp[i][1].equals(prod)));
    @*/
    
    
    
    // helper functions
    public /*@ pure @*/ boolean prodExists(String prod) {
        boolean found = false;
        int i = 0;
        while(!found && i < nb_inc) {
            found = incomp[i][0].equals(prod) || incomp[i][1].equals(prod);
            i++;
        }
        return found;
    }

    
    /*@ ensures
    @ (\exists int i; 0 <= i && i < nb_assign;
    @ ! ( assign[i][0].equals(bat));
    @*/
    
    public /*@ pure @*/ boolean batExists(String bat) {
        boolean found = false;
        int i = 0;
        while(!found && i < nb_assign) {
            found = assign[i][0].equals(bat);
            i++;
        }
        return found;
    }

    private List getBats() {
        List bats = new ArrayList();
        for(int i = 0; i < nb_assign; i++) {
            if(!bats.contains(assign[i][0])) {
                bats.add(assign[i][0]);
            }
        }
        return bats;
    }

    private List getProds(String bat) {
        List prods = new ArrayList();
        for(int i = 0; i < nb_assign; i++) {
            if(assign[i][0].equals(bat)) {
                if(!prods.contains(assign[i][1])) {
                    prods.add(assign[i][1]);
                }
            }
        }
        return prods;
    }

    public void skip() {}
}
