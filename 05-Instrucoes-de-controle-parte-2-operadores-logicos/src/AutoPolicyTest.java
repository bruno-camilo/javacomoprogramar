public class AutoPolicyTest{
    public static void main(String[] args){
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    } 
    
    public static void policyInNoFaultState(AutoPolicy autopolicy){
        System.out.println("The auto policy:");
        System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", 
                          autopolicy.getAccountNumber(),
                          autopolicy.getMakeAndModel(),
                          autopolicy.getState(),
                          (autopolicy.isNoFaultState() ? "is" : "is not"));
    }
}
