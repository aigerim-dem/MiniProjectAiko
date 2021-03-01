public class MainForWorkers {
    public static void main (String [] args){
        Staff1 staff1 = new Staff1 (1, "worker1", "worker1.1", 100);
        Staff1 staff2 = new Staff1 (1, "worker1", "worker1.1", 100);
        Staff1 staff3 = new Staff1 (1, "worker1", "worker1.1", 100);
        Staff1 staff4 = new Staff1 (1, "worker1", "worker1.1", 100);
        Staff1 staff5 = new Staff1 (1, "worker1", "worker1.1", 100);
        HRManagers hr1 = new HRManagers(1, "HR1, HR1.1", 120);
        HRManagers hr2 = new HRManagers(1, "HR1, HR1.1", 120);
        HRManagers hr3 = new HRManagers(1, "HR1, HR1.1", 120);
        HRManagers hr4 = new HRManagers(1, "HR1, HR1.1", 120);
        HRManagers hr5 = new HRManagers(1, "HR1, HR1.1", 120);
        Programmers programmers1 = new Programmers(1, "nickname1", 130, 50, 0.5);
        Programmers programmers2 = new Programmers(1, "nickname1", 130, 50, 0.7);
        Programmers programmers3 = new Programmers(1, "nickname1", 130, 50, 0.3);
        Programmers programmers4 = new Programmers(1, "nickname1", 130, 50, 1);
        Programmers programmers5 = new Programmers(1, "nickname1", 130, 50, 0.8);


        Workers [] workers = {staff1,staff2, staff3, staff4, staff5, hr1, hr2, hr3, hr4, hr5, programmers1, programmers2, programmers3, programmers4, programmers5};
        //for (int i=0; i< workers.length; i++){
          //  System.out.println(workers[i].getWorkerData());
        //}

        int max = workers[0].getSalary();
        int maxIndex=0;

        for (int i=0; i<workers.length; i++){
            if (max<workers[i].getSalary()) max=workers[i].getSalary();
            maxIndex=i;
        }
        System.out.println(max + " " + maxIndex);
        System.out.println(workers[maxIndex].getWorkerData());
    }
}
