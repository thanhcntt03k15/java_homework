package Controller;

import Model.Crops;
import Model.Pet;
import Model.Worker;

import java.io.*;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.lang.Integer;

public class FileController {
    private FileWriter fileWriter;
    private BufferedWriter bufferedWriter;
    private PrintWriter printWriter;
    private Scanner scanner;

    public void OpenFileToWrite(String fileName) throws IOException {
            scanner= new Scanner(fileName);
            fileWriter = new FileWriter(fileName, true);
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);

    }

    public void closeFileAfterWriter() throws IOException {
        printWriter.close();
        bufferedWriter.close();
        fileWriter.close();
    }
    public void openFiletoRead(String fileName) throws IOException {
        File file= new File(fileName);
        if(file.exists())
            file.createNewFile();
        scanner= new Scanner(Paths.get(fileName ),"UTF-8");
    }
    public Worker readWorkerFromFile(String data) {

        String[] datas=data.split("\\|");

        Worker worker= new Worker( Integer.parseInt(datas[0]),datas[1],datas[2],datas[3],Integer.parseInt(datas[4]),datas[5],datas[6],datas[7] );
        return worker;
    }
    public List<Worker> readWorkersFromFile(String fileName) throws IOException {
        openFiletoRead(fileName);
        List<Worker> workers = new ArrayList<>();
        while(scanner.hasNext()){
            String data = scanner.nextLine();
            Worker worker = readWorkerFromFile(data);
            workers.add(worker);
        }
        closeFileafterRead();
        return workers;
    }
    public Pet readPetFromFile(String data)
    {
        String[] datas=data.split("\\|");
        Pet pet= new Pet( Integer.parseInt(datas[0]),datas[1],datas[2],datas[3], Integer.parseInt(datas[4]),datas[5]);
        return pet;
    }
    public List<Pet> readPetsDromFile(String fileName) throws IOException {
        openFiletoRead(fileName);
        List<Pet> pets= new ArrayList<>();
        while(scanner.hasNext()){
            String data = scanner.nextLine();
            Pet pet = readPetFromFile(data);
            pets.add(pet);
        }
        closeFileafterRead();
        return pets;
    }
    public Crops readCropsFromFile(String data)
    {
        String[] datas = data.split("\\|");
        Crops crops= new Crops( Integer.parseInt(datas[0]),datas[1],datas[2],Integer.parseInt(datas[3]),datas[4] );
        return crops;
    }
    public List<Crops> readCropsListFromFile(String fileName) throws IOException {
        openFiletoRead(fileName);
        List<Crops> cropsList= new ArrayList<>(  );
        while (scanner.hasNext())
        {
            String data= scanner.nextLine();
            Crops crops= readCropsFromFile(data);
            cropsList.add(crops);
        }
        closeFileafterRead();
        return cropsList;
    }
    public void closeFileafterRead()
    {
        scanner.close();
    }
    public void writeworkertoFile(String fileName, Worker worker) throws IOException {
        OpenFileToWrite(fileName);
        printWriter.println(worker.id+"|"+worker.username+"|"+worker.pass+"|"+worker.name+"|"+worker.age+
                "|"+worker.gender+"|"+ worker.address +"|"+ worker.phone+"\n");
        closeFileAfterWriter();
    }

    public void writePetToFile(String fileName, Pet pet) throws IOException {
        OpenFileToWrite(fileName);
        printWriter.println(pet.id+"|" +pet.name +"|" +pet.period +"|" +pet.gender +"|"+ pet.quantily+ "|"+ pet.status +"\n");

        closeFileAfterWriter();
    }
    public  void writeCropsToFile(String fileName, Crops crops) throws IOException {
        OpenFileToWrite(fileName);
        printWriter.println(crops.getId()+"|"+crops.getName()+"|"+crops.getPeriod()+"|"+crops.getArea()+"|"+crops.getArea()+"\n");
        closeFileAfterWriter();
    }
    public void updateWorkerToFile(List<Worker> workers, String fileName) throws IOException {
        File file= new File(fileName);
        file.delete();
        for(Worker worker: workers)
        {
            writeworkertoFile(fileName,worker);
        }
    }
    public void updatePetToFile(List<Pet> pets, String fileName) throws IOException {
        File file = new File(fileName);
        file.delete();
        for (Pet pet : pets) {
            writePetToFile(fileName, pet);
        }
    }
    public  void updateCropsToFile(List<Crops> crops , String fileName) throws IOException {
        File file = new File(fileName);
        file.delete();
        for (Crops crops1: crops)
        {
            writeCropsToFile(fileName,crops1);
        }
    }
    public void writeMessengerToFile(Worker worker,String messenger, String fileName)
    {
        File file = new File(fileName);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String timeAT = formatter.format(date);
        printWriter.printf(worker.getName()+"|"+messenger+"|"+ timeAT +"\n" );
    }
    public   boolean checkOwner(String a, String b) {
        if (a.compareToIgnoreCase("1") == 0 && b.compareToIgnoreCase("1") == 0)
            return true;
        return false;
    }
}
