public class DataType {

    public static void NameBagikan(){
        System.out.println("Yazid Istiqlal");
    }

    public static void main(String[] args) {

        NameBagikan();

        System.out.println("========VARIABLE========");

        //variable
        String nama, rumah;
        int alamat, nomor_rumah;

        //string
        nama = "Yazid Istiqlal Adhy Fadhillah";
        rumah = "bagelen 2";

        //int
        alamat = 142;
        nomor_rumah = 12;

        Object dataLengkap = String.format("Halo nama Saya %s rumah saya di %s nomor rumah saya adalah %s dan %s", nama, rumah, alamat, nomor_rumah);
        System.out.println(dataLengkap);

        System.out.println("==========SINGLE DATA==========");

        // string
        System.out.println("=======STR=======");
        System.out.println("Hello World");

        //int
        System.out.println("=======INT=======");
        System.out.println(12);

        //float
        System.out.println("=======FLT=======");
        System.out.println(90.0f);

        //boolean
        System.out.println("=======BOL=======");
        System.out.println(true);

        //char
        System.out.println("=======CHAR=======");
        System.out.println("d");


        System.out.println("==========MULTIPLE DATA==========");

        //array string
        System.out.println("=======ARRAY=======");
        String[] plane = {"garuda", "citilink", "jayapura airland", "lion"};
        System.out.println(plane[0]);
        System.out.println(plane[1]);
        System.out.println(plane[2]);
        System.out.println(plane[3]);

        //definetion java data type and object
        System.out.println("=======OBJECT=======");
        Object[] TypeModel = {"garuda", 2005, 30.23f, "indonesia airport"};
        System.out.println(TypeModel[0]);
        System.out.println(TypeModel[1]);
        System.out.println(TypeModel[2]);
        System.out.println(TypeModel[3]);


        //defini terlebih dahulu
        Object[] DataKTP = new Object[5];

        DataKTP[0] = "Yazid Istiqlal Adhy Fadhillah";
        DataKTP[1] = "10/12/2005";
        DataKTP[2] = "Bagelen II";
        DataKTP[3] = 42342;
        DataKTP[4] = "Lampung Indonesia";

        Object DataMasyarakat = String.format("halo nama saya %s nomor ktp %s saya tanggal lahir saya %s saya lahir di %s %s", DataKTP[0], DataKTP[3] ,DataKTP[1], DataKTP[2], DataKTP[4]);
        System.out.println(DataMasyarakat);
    }
}