public class PrincipalVeterinaria{
    public static void main(String[] args){
        Persona p1,p2,p3,p4,p5;
        Mascota m1,m2,m3,m4,m5,m6,m7;
        
        p1=new Persona("Amelia Castor", "VET-101");
        p2=new Persona("Ali Coleman", "VET-205");
        p3=new Persona("Hazal Howard", "VET-310");
        p4=new Persona("Jasmín Lavanda", "VET-145");
        p5=new Persona("Erick Hassid", "VET-431");
        
        m1=new Mascota("Cookie", "French Poodle", 2023);
        m2=new Mascota("Ginger", "Chiwawa");
        m3=new Mascota("Nieve", "Hush Poppy",2020);
        m4=new Mascota("Tarzán", "Pitbull",2019);
        m5=new Mascota("Salchicha", "Salchicha",2024);
        m6=new Mascota("Príncipe", "Golden Retriever");
        m7=new Mascota("Guardián", "Pastor Alemán", 2025);
        
        System.out.println("****ESTADO INICIAL VETERINARIOS****");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println();

        
        System.out.println("****ESTADO INICIAL MASCOTAS****");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(m4.toString());
        System.out.println(m5.toString());
        System.out.println(m6.toString());
        System.out.println(m7.toString());
        System.out.println();
        
        
        m1.asignarVeterinario(p1);
        p1.asignarMascota(m1);
        
        m2.asignarVeterinario(p2);
        p2.asignarMascota(m2);
        
        m3.asignarVeterinario(p1);
        p1.asignarMascota(m3);
        
        m4.asignarVeterinario(p3);
        p3.asignarMascota(m4);
        
        m5.asignarVeterinario(p4);
        p4.asignarMascota(m5);
        
        m6.asignarVeterinario(p2);
        p2.asignarMascota(m6);
        
        m7.asignarVeterinario(p5);
        p5.asignarMascota(m7);
        
        
        System.out.println("****VETERINARIO DE CADA MASCOTA****");
        System.out.println("Veterinario de " + m1.getNombre() + ": " + m1.consultarNombreVeterinario());
        System.out.println("Veterinario de " + m2.getNombre() + ": " + m2.consultarNombreVeterinario());
        System.out.println("Veterinario de " + m3.getNombre() + ": " + m3.consultarNombreVeterinario());
        System.out.println("Veterinario de " + m4.getNombre() + ": " + m4.consultarNombreVeterinario());
        System.out.println("Veterinario de " + m5.getNombre() + ": " + m5.consultarNombreVeterinario());
        System.out.println("Veterinario de " + m6.getNombre() + ": " + m6.consultarNombreVeterinario());
        System.out.println("Veterinario de " + m7.getNombre() + ": " + m7.consultarNombreVeterinario());
        System.out.println();
        
        System.out.println("****MASCOTAS ASIGNADAS A CADA VETERINARIO****");
        System.out.println(p1.getNombre() + ": " + p1.consultarNombreMisMascotas());
        System.out.println(p2.getNombre() + ": " + p2.consultarNombreMisMascotas());
        System.out.println(p3.getNombre() + ": " + p3.consultarNombreMisMascotas());
        System.out.println(p4.getNombre() + ": " + p4.consultarNombreMisMascotas());
        System.out.println(p5.getNombre() + ": " + p5.consultarNombreMisMascotas());
        System.out.println();
        
        
        System.out.println("****ESTADO FINAL MASCOTAS****");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m3.toString());
        System.out.println(m4.toString());
        System.out.println(m5.toString());
        System.out.println(m6.toString());
        System.out.println(m7.toString());
        System.out.println();
        
        System.out.println("****ESTADO FINAL VETERINARIOS****");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
    }
}