package org.launchcode.techjobs.oo;
public class Main {

    public static void main(String[] args) {
        Location test = new Location("Bulos");
        Location test2 = new Location("Goma");
        System.out.println(test.getId());
        System.out.println(test2.getId());
        System.out.println(test);
       Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType(null), new CoreCompetency("Persistence"));
        System.out.println(job1);
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }
    }

}
