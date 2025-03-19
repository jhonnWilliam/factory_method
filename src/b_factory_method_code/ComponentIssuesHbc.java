package b_factory_method_code;

public class ComponentIssuesHbc extends ComponentIssue{
    public QuickCardIssues createQuickCardIssue() {
        return new QuickCardIssuesHbc();
    }
}
