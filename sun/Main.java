import java.util.Scanner;


interface petshop {
    public void jenispricelist();
}
//print untuk kelinci himalayan//
class asian implements petshop {
    public void jenispricelist() {
        System.out.println("kelinci himalayan memiliki berat 2 sampai 6 kilogram. Rata-ratanya adalah 4 kilogram ");
    }
}
//print untuk kelinci dutch//
class eropa implements petshop {
    public void jenispricelist() {
        System.out.println("kelinci dutch memiliki berat 1 sampai 3 kilogram. Rata-ratanya adalah 2 kilogram");
    }
}
//print untuk kelinci satin//
class amerika implements petshop {
    public void jenispricelist() {
        System.out.println("kelinci satin memiliki berat 4 sampai 6 kilogram. Rata-ratanya adalah 5 kilogram-");
    }
}

class pricelist {
    private petshop petshop;

    public void setpetshop(petshop Jenis) {
        this.petshop = Jenis;
    }

    public petshop getpetshop() {
        return petshop;
    }

    public void jenispricelist() {
        petshop.jenispricelist();
    }

}

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        System.out.println("###pricelist###");
        System.out.println("\n A.asian \n B.eropa \n C.amerika \n ");
        scanner = new Scanner(System.in);
        String Typepricelist = scanner.next();

        pricelist pricelist = null;
        pricelist = new pricelist();

        if ("A".equalsIgnoreCase(Typepricelist)) {
            pricelist.setpetshop(new asian());
             rabbit himalayan = new himalayan();
    	rabbitadapter himalayanAdapter = new rabbitadapterImpl(himalayan);
        System.out.println("Berat rabbit asian Dalam gram adalah " + himalayanAdapter.getkg() );
        } else if ("B".equalsIgnoreCase(Typepricelist)) {
            pricelist.setpetshop(new eropa());
            rabbit dutch = new dutch();
    	rabbitadapter dutchAdapter = new rabbitadapterImpl(dutch);
        System.out.println("Berat rabbit eropa Dalam gram adalah " + dutchAdapter.getkg() );
        } else if ("C".equalsIgnoreCase(Typepricelist)) {
            pricelist.setpetshop(new amerika());
            rabbit satin = new satin();
    	rabbitadapter satinAdapter = new rabbitadapterImpl(satin);
        System.out.println("Berat rabbit amerika Dalam gram adalah " + satinAdapter.getkg() );
        }
        
        pricelist.jenispricelist();

        

       

        
    }

    
    	
    
}