package RunMain;

import Controller.FileController;

import Model.Crops;
import Model.Pet;
import Model.Worker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RunMain {
    static Scanner scanner= new Scanner(System.in);
    static List<Worker> workers= new ArrayList<>(  );
    static List<Pet> pets= new ArrayList<>(  );
    static List<Crops> cropsList= new ArrayList<>(  );
    static FileController fileController= new FileController();
    static String regUserName = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9]{6,20}$";
    static String regPassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])[A-Za-z0-9@#$%^&+=]{8,16}$";
    static String regPhone = "^0[0-9]{9}$";
    static int idpet;
    static int idcrops;
    static int idworker;
    public static void main(String[] args) throws IOException {
        int t;
        int k;

        workers=fileController.readWorkersFromFile("Worker.Dat");
        pets = fileController.readPetsDromFile("Pet.DAT");
        cropsList=fileController.readCropsListFromFile("Crops.DAT");
        idpet=pets.size()+1;
        idcrops=cropsList.size()+1;
        idworker=workers.size()+1;
        {
            System.out.println("|===========OurFarm========|");
            System.out.println("|1.Login farm owner        |");
            System.out.println("|2.Login worker            |");
            System.out.println("|3.Exit                    |");
            System.out.println("|==========================|");
            System.out.println("Enter your choose :");
            t= scanner.nextInt();
            switch (t)
            {
                case 1:
                    System.out.println("Enter use name : " );
                    scanner.nextLine();
                    String a=scanner.nextLine();
                    System.out.println( "Enter password : " );
                    String b=scanner.nextLine();
                    if (fileController.checkOwner(a,b)==true)
                    {
                        do {
                            System.out.println("|============OwnerManage==========|" );
                            System.out.println("|1.Add                            |" );
                            System.out.println("|2.Search                         |" );
                            System.out.println("|3.Show                           |" );
                            System.out.println("|4.Update                         |");
                            System.out.println("|5.Delete                         |" );
                            System.out.println("|6.Exit                           |" );
                            System.out.println("|=================================|" );
                            System.out.println("Enter your choose :" );
                            k=scanner.nextInt();
                            switch (k)
                            {
                                case 1:
                                    add();
                                    break;
                                case 2:
                                    search();
                                    break;
                                case 3:
                                    show();
                                    break;
                                case 4 :
                                    update();
                                    break;
                                case 5 :
                                    delete();
                                    break;
                            }

                        }

                        while (k!=6);
                    }
                    else
                        System.out.println("Wrong user name or password !" );
                    break;
                case 2:
                {
                    int m;
                    do{
                    System.out.println("|=========Worker=======|" );
                    System.out.println("|1.Login               |" );
                    System.out.println("|2.register            |" );
                    System.out.println("|3.Forgot password     |" );
                    System.out.println("|4.Exit                |" );
                    System.out.println("|======================|" );
                    System.out.print("Enter your choose : " );
                    m=scanner.nextInt();
                    switch (m)
                    {
                        case 1:
                            loginWorker();
                            break;
                        case 2:
                            addworker();
                            break;
                        case 3 :
                            //forgotPassword();
                    }
                    if (m==4)
                        break;
                    } while (true);
                    break;
                }
                case 3:
                    break;

            }
        }
        while(true);

    }



    static void add() throws IOException {
        int t;
        do {
            System.out.println("|=========Add========|" );
            System.out.println("|1.work              |" );
            System.out.println("|2.pet               |" );
            System.out.println("|3.crops             |" );
            System.out.println("|4.exit              |" );
            System.out.println("|====================|" );
            System.out.println("Enter your choose:" );
            t=scanner.nextInt();
            switch (t)
            {
                case 1:
                    addworker();
                    break;
                case 2:
                    addpet();
                    break;
                case 3 :
                    addcrops();
                    break;
            }
            if (t==4)
                break;

        }
        while (true);
    }
    static void addpet() throws IOException
    {
        Pet pet1= new Pet(  );
        pet1.setId(idpet++);
        scanner.nextLine();
        System.out.println("Enter pet name :" );
        pet1.setName(scanner.nextLine());
        System.out.println("Enter period of pet ( immature|mature|old): " );
        pet1.setPeriod(scanner.nextLine());
        System.out.println("Enter gender of pet (male|female): " );
        pet1.setPeriod(scanner.nextLine());
        System.out.println("Enter quantily of pet (animals): " );
        pet1.setQuantily(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter status of pet (good|sick| weak ): " );
        pet1.setStatus(scanner.nextLine());
        int k=0;
        for (Pet pet:pets)
        {
            if (pet1.getName().compareToIgnoreCase(pet.getName())==0 &&
                pet1.getPeriod().compareToIgnoreCase(pet.getPeriod())==0 &&
                pet1.getGender().compareToIgnoreCase(pet.getGender())==0 &&
                pet1.getStatus().compareToIgnoreCase(pet.getStatus())==0)
            {
                pet.setQuantily(pet.getQuantily()+pet1.getQuantily());
                k=1;
                break;
            }
        }
        if (k==0)
        pets.add(pet1);
        fileController.writePetToFile("Pet.DAT",pet1);
    }
    static void addcrops() throws IOException
    {
        Crops crops1= new Crops(  );
        crops1.setId(idcrops);
        scanner.nextLine();
        System.out.println("Enter crops name :" );
        crops1.setName(scanner.nextLine());
        System.out.println("Enter period of crops( immature|mature|old) : " );
        crops1.setPeriod(scanner.nextLine());
        System.out.println("Enter area of crops : " );
        crops1.setArea(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter status of crops : " );
        crops1.setStatus(scanner.nextLine());
        int k=0;
        for (Crops crops: cropsList)
        {
            if (crops.getName().compareToIgnoreCase(crops1.getName())==0 &&
                crops.getPeriod().compareToIgnoreCase(crops1.getPeriod())==0 &&
                crops.getStatus().compareToIgnoreCase(crops1.getStatus())==0)
            {
                crops.setArea(crops.getArea()+crops1.getArea());
                k=1;
                break;
            }
        }
        if (k==0)
        cropsList.add(crops1);
        fileController.writeCropsToFile("Crops.DAT",crops1);
    }
    static void addworker() throws IOException {
        Worker worker1= new Worker(  );
        do{
            scanner.nextLine();

            System.out.print("Enter your username :" );
            worker1.setUsername(scanner.nextLine());
            Pattern pattern=Pattern.compile(regUserName);
            if (pattern.matcher(worker1.getUsername()).find()==false)
            {
                System.out.println("Username Wrong !" );
            }
            else
                break;
            for (Worker workerx: workers)
            {
                if (workerx.getUsername().compareToIgnoreCase(worker1.getUsername())==1)
                {
                    System.out.println("This worker already exists!" );
                }
            }
        }
        while (true);
        do
        {
            System.out.println("Enter your password :" );
            worker1.setPass(scanner.nextLine( ));
            Pattern pattern= Pattern.compile(regPassword);
            if (pattern.matcher(worker1.getPass()).find()==false)
            {
                System.out.println("Pass Wrong !" );
            }
            else
                break;
        }
        while (true);
        System.out.println("Enter name : " );
        worker1.setName(scanner.nextLine());
        System.out.println("Enter age : " );
        worker1.setAge(scanner.nextInt());
        System.out.println("Enter gender : " );
        scanner.nextLine();
        worker1.setGender(scanner.nextLine());
        System.out.println("Enter address : " );
        worker1.setAddress(scanner.nextLine());
        do
        {
            System.out.println("Enter your phone :" );
            worker1.setPhone(scanner.nextLine( ));
            Pattern pattern= Pattern.compile(regPhone);
            if (pattern.matcher(worker1.getPhone()).find()==false)
            {
                System.out.println("Phone Wrong !" );
            }
            else
                break;
        }
        while (true);
        worker1.setId(idworker++);
        workers.add(worker1);
        fileController.writeworkertoFile("Worker.DAT",worker1);

    }
    static void search()
    {
        int t;
        do {
            System.out.println("|=======Search=======|" );
            System.out.println("|1.work              |" );
            System.out.println("|2.pet               |" );
            System.out.println("|3.crops             |" );
            System.out.println("|4.exit              |" );
            System.out.println("|====================|" );
            t=scanner.nextInt();
            switch (t)
            {
                case 1:
                    searchwork();
                    break;
                case 2:
                    searchpet();
                    break;
                case 3 :
                    searchcrops();
                    break;
            }
            if (t==4)
                break;

        }
        while (true);
    }
    static void searchwork()
    {
        String name = scanner.nextLine();
        System.out.println("ID|Username|Password|Name|Age|Gender|Address|Phone ");
        for (Worker workerx: workers)
        {
            if (name.compareToIgnoreCase(workerx.getName())==0)
            {
                workerx.output();
            }
        }
    }
    static  void searchpet()
    {
        String name = scanner.nextLine();
        System.out.println ("ID|Name|Period|Gender|Quantily|Status" );
        for (Pet pet: pets)
        {
            if (name.compareToIgnoreCase(pet.getName())==0)
            {
                pet.output();
            }
        }

    }
    static void searchcrops()
    {
        String name = scanner.nextLine();
        System.out.println("ID|Name|Period|Area|Status" );
        for (Crops crops: cropsList)
        {
            if (name.compareToIgnoreCase(crops.getName())==0)
            {
                crops.output();
            }
        }
    }
    static void show() throws IOException {
        int t;
        do {
            System.out.println("|========Show========|" );
            System.out.println("|1.work              |" );
            System.out.println("|2.pet               |" );
            System.out.println("|3.crops             |" );
            System.out.println("|4.exit              |" );
            System.out.println("|====================|" );
            t=scanner.nextInt();
            switch (t)
            {
                case 1:
                    showworker();
                    break;
                case 2:
                    showpet();
                    break;
                case 3 :
                    showcrops();
                    break;
            }
            if (t==4)
                break;
        }
        while (true);
    }
    static void showworker() throws IOException {
        System.out.println("ID|Username|Password|Name|Age|Gender|Address|Phone ");
        for (Worker worker : workers)
        {
            worker.output();
        }
        fileController.updateWorkerToFile(workers,"Worker.DAT");
    }
    static  void showpet() throws IOException {
        System.out.println ("ID|Name|Period|Gender|Quantily|Status" );
        for (Pet pet : pets)
        {
            pet.output();
        }
        fileController.updatePetToFile(pets,"Pet.DAT");
    }
    static  void showcrops() throws IOException {
        System.out.println("ID|Name|Period|Area|Status" );
        for (Crops crops: cropsList)
        {
            crops.output();
        }
        fileController.updateCropsToFile(cropsList,"Crops.DAT");
    }
    static void update() throws IOException {
        int t;
        do {
            System.out.println("|========Update======|" );
            System.out.println("|1.work              |" );
            System.out.println("|2.pet               |" );
            System.out.println("|3.crops             |" );
            System.out.println("|4.exit              |" );
            System.out.println("|====================|" );
            t=scanner.nextInt();
            switch (t)
            {
                case 1:
                    updateworker();
                    break;
                case 2:
                    updatepet();
                    break;
                case 3 :
                    updatecrops();
                    break;
            }
            if (t==4)
                break;
        }
        while (true);
    }
    static void updateworker() throws IOException {
        System.out.println("Enter the id worker :" );
        int id = scanner.nextInt();
        for (Worker worker: workers)
        {
            if (worker.getId()==id)
            {
                int m;
                do {
                    System.out.println("|=======Replace========|");
                    System.out.println("|1.Username            |" );
                    System.out.println("|2.Pass                |" );
                    System.out.println("|3.Name                |" );
                    System.out.println("|4.Age                 |" );
                    System.out.println("|5.Gender              |" );
                    System.out.println("|6.Address             |" );
                    System.out.println("|7.Phone               |" );
                    System.out.println("|8.Exit                |" );
                    System.out.println("|======================|" );
                    System.out.println("Enter choose :" );
                    m=scanner.nextInt();
                    switch (m)
                    {
                        case 1:
                        {
                            scanner.nextLine();
                            System.out.println("Enter new usename : " );
                            worker.setUsername(scanner.nextLine( ));
                            break;
                        }
                        case 2:
                        {
                            scanner.nextLine();
                            System.out.println("Enter new pass : " );
                            worker.setPass(scanner.nextLine( ));
                            break;
                        }
                        case 3 :
                        {
                            scanner.nextLine();
                            System.out.println("Enter new name : " );
                            worker.setName(scanner.nextLine( ));
                            break;
                        }
                        case 4:
                        {
                            scanner.nextLine();
                            System.out.println("Enter new age : " );
                            worker.setAge(scanner.nextInt( ));
                            break;
                        }
                        case 5:
                        {
                            scanner.nextLine();
                            System.out.println("Enter new gender : " );
                            worker.setGender(scanner.nextLine());
                            break;
                        }
                        case 6:
                        {
                            scanner.nextLine();
                            System.out.println("Enter new address : " );
                            worker.setAddress(scanner.nextLine( ));
                            break;
                        }
                        case 7:
                        {
                            scanner.nextLine();
                            System.out.println("Enter new phone : " );
                            worker.setPhone(scanner.nextLine( ));
                            break;
                        }

                    }
                    if (m==8)
                        break;

                }
                while (true);
            }
        }
        fileController.updateWorkerToFile(workers,"Worker.DAT");

    }
    static void updatepet() throws IOException {
        System.out.println("Enter the pet id :" );
        int id = scanner.nextInt();
        for (Pet pet: pets)
        {
            if (pet.getId()==id)
            {
                int m;
                do {
                    System.out.println("|=======Replace=====|" );
                    System.out.println("|1.Name             |" );
                    System.out.println("|2.Period           |" );
                    System.out.println("|3.Gender           |" );
                    System.out.println("|4.Quantily         |" );
                    System.out.println("|5.Status           |" );
                    System.out.println("|6.Exit             |" );
                    System.out.println("|===================|" );
                    System.out.println("Enter your choose : " );
                    m=scanner.nextInt();
                    switch (m)
                    {
                        case 1:
                        {
                            scanner.nextLine();
                            System.out.println("Enter name :" );
                            pet.setName(scanner.nextLine());
                            break;
                        }
                        case 2:
                        {
                            scanner.nextLine();
                            System.out.println("Enter period : " );
                            pet.setPeriod(scanner.nextLine());
                            break;
                        }
                        case 3:
                        {
                            scanner.nextLine();
                            System.out.println("Enter gender : " );
                            pet.setPeriod(scanner.nextLine());
                            break;
                        }
                        case 4:
                        {
                            scanner.nextLine();
                            System.out.println("Enter quantily : " );
                            pet.setQuantily(scanner.nextInt());
                            break;
                        }
                        case 5 :
                            scanner.nextLine();
                            System.out.println("Enter status : " );
                            pet.setStatus(scanner.nextLine());
                            break;
                    }
                    if (m==6)
                        break;
                }
                while (true);
            }
        }
        fileController.updateWorkerToFile(workers,"Worker.DAT");
    }
    static void updatecrops() throws IOException {
        System.out.println("Enter id : " );
        int id = scanner.nextInt();
        for (Crops crops: cropsList)
        {
            if (crops.getId()==id)
            {
                int m;
                do {
                    System.out.println("|======Replace=======|" );
                    System.out.println("|1.Name              |" );
                    System.out.println("|2.Period            |" );
                    System.out.println("|3.Area              |" );
                    System.out.println("|4.Status            |" );
                    System.out.println("|5.Exit              |" );
                    System.out.println("|====================|" );
                    m= scanner.nextInt();
                    switch (m)
                    {
                        case 1 :
                        {
                            scanner.nextLine();
                            System.out.println("Enter name :" );
                            crops.setName(scanner.nextLine());
                            break;
                        }
                        case 2:
                        {
                            scanner.nextLine();
                            System.out.println("Enter period :" );
                            crops.setPeriod(scanner.nextLine());
                            break;
                        }
                        case 3:
                        {
                            scanner.nextLine();
                            System.out.println("Enter area:" );
                            crops.setArea(scanner.nextInt());
                            break;
                        }
                        case 4:
                        {
                            scanner.nextLine();
                            System.out.println("Enter status :" );
                            crops.setArea(scanner.nextInt());
                            break;
                        }

                    }
                    if (m==5)
                        break;
                }
                while (true);
            }
        }
        fileController.updateCropsToFile(cropsList,"Crops.DAT");
    }
    public static void delete() throws IOException {
        int i;
        do {


            System.out.println("|========Delete======|");
            System.out.println("|1.worker            |");
            System.out.println("|2.pet               |");
            System.out.println("|3.crops             |");
            System.out.println("|4.Exit              |" );
            System.out.println("|====================|" );
            i= scanner.nextInt( );
            switch (i)
            {
                case 1:
                    deleteWorker();
                    break;
                case 2:
                    deletePet();
                    break;
                case 3:
                    deleteCrops();
                    break;
            }
            if (i==4)
                break;
        }while(true);
    }

    static void deleteWorker() throws IOException {
        System.out.println("Enter id :" );
        int id= scanner.nextInt( );
        for (Worker worker: workers)
        {
            if (worker.getId()==id)
            {
                workers.remove(worker);
                break;
            }
        }
        fileController.updateWorkerToFile(workers,"Worker.DAT" );
    }
    static  void deletePet() throws IOException {
        System.out.println("Enter id : " );
        int id =scanner.nextInt();
        for (Pet pet : pets)
        {
            if (pet.getId()==id)
            {
                pets.remove(pet);
            }
        }
        fileController.updatePetToFile(pets,"Pet.DAT");
    }
    static  void deleteCrops() throws IOException {
        System.out.println("Enter id : " );
        int id = scanner.nextInt();
        for (Crops crops: cropsList)
        {
            if (crops.getId()==id)
            {
                cropsList.remove(crops);
            }
        }
        fileController.updateCropsToFile(cropsList,"Crops.DAT");
    }

    static void loginWorker() throws IOException {
        System.out.println("Enter use name : " );
        String usename= scanner.nextLine( );
        for (Worker worker: workers)
        {
            if (usename.compareToIgnoreCase(worker.getUsername())==0)
            {
                System.out.println("Enter password : " );
                String pass= scanner.nextLine( );
                if (pass.compareToIgnoreCase(worker.getPass())==0)
                {
                    doLoginWorker(worker);
                }
            }
            else
                System.out.println("Wrong use name!" );
        }
    }
    static void doLoginWorker(Worker worker) throws IOException {

        do {
            int m;

            System.out.println("|=========Worker=======|");
            System.out.println("|1.Show information    |");
            System.out.println("|2.Fix information     |");
            System.out.println("|3.Send message        |");
            System.out.println("|4.Exit                |");
            System.out.println("|======================|");
            System.out.print("Enter your choose : ");
            m = scanner.nextInt( );

            switch (m)
            {
                case 1:
                {
                    scanner.nextLine();
                    System.out.println("ID|Username|Password|Name|Age|Gender|Address|Phone ");
                    worker.output();
                    show();
                    break;
                }
                case 2:
                {
                    scanner.nextLine();
                    updateworker();
                    break;
                }
                case 3:
                {
                    scanner.nextLine();
                    System.out.println("Enter the messenger : " );
                    String messenger=scanner.nextLine();
                    fileController.writeMessengerToFile(worker,messenger,"Messenger.DAT");
                    break;
                }
            }
        }while (true);

    }


}
