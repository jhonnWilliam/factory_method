package c_factory_method_and_simple_factory_code;

class Main {
    public static void main(String[] args) {
        String quickCardType = "History";
//        String quickCardType = "Recent";
//        String quickCardType = "HBC";
        ComponentIssue componentIssue = ComponentIssueFactory.getComponentIssue(quickCardType);
        componentIssue.showComponentIssue();
    }
}
