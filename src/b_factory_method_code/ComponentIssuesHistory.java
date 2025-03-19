package b_factory_method_code;

public class ComponentIssuesHistory extends ComponentIssue {
    public QuickCardIssues createQuickCardIssue() {
        return new QuickCardIssuesHistory();
    }
}
