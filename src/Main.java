public class Main {
    public static void main(String[] args) {
        Cuenta miCuenta= new Cuenta("123456", "credito", 150000);
        System.out.println("saldo minimo: "+miCuenta.getSaldoMinimo());
        miCuenta.consignar(80000);
        System.out.println("saldo actual: "+miCuenta.getSaldoActual());
        miCuenta.retirar(250000);
        System.out.println("saldo actual: "+miCuenta.getSaldoActual());
        System.out.println(miCuenta.toString());
        miCuenta.setNumero("34665879");
        System.out.println(miCuenta.toString());
        System.out.println("------------------------------------------");

        Cuenta pedroCuenta= new Cuenta("5868567","prestamo",5000);
        System.out.println(pedroCuenta.toString());
    }
}
