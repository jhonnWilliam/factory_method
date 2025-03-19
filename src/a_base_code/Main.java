package a_base_code;

class Main {
    public static void main(String[] args) {
//        String quickCardType = "History";
        String quickCardType = "HBC";
        QuickCardIssue quickCard = getCard(quickCardType);
        quickCard.renderComponent();
    }

    static QuickCardIssue getCard(String name){
        if(name.equals("HBC")) {
            return new  QuickCardIssueHbc();
        }
        return new QuickCardIssueHistory();
    }
}
