package c_factory_method_and_simple_factory_code;

public class ComponentIssuesRecent extends ComponentIssue {
    public QuickCardIssues createQuickCardIssue() {
        return new QuickCardIssuesRecent();
    }
}
