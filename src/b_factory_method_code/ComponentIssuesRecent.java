package b_factory_method_code;

public class ComponentIssuesRecent extends ComponentIssue {
    public QuickCardIssues createQuickCardIssue() {
        return new QuickCardIssuesRecent();
    }
}
