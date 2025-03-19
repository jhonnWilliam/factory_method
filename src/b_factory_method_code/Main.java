package b_factory_method_code;

class Main {
    public static void main(String[] args) {
//        String quickCardType = "History";
        String quickCardType = "Recent";
//        String quickCardType = "HBC";
        ComponentIssue componentIssue = getCard(quickCardType);
        componentIssue.showComponentIssue();
    }

    static ComponentIssue getCard(String name){
        if(name.equals("HBC")) {
            return new ComponentIssuesHbc();
        }
        if(name.equals("History")) {
            return new ComponentIssuesHistory();
        }
        return new ComponentIssuesRecent();
    }
}
