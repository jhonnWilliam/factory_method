package b_factory_method_code;

public abstract class ComponentIssue {
    public abstract QuickCardIssues createQuickCardIssue();

    public void showComponentIssue() {
        QuickCardIssues quickCardIssue = this.createQuickCardIssue();
        quickCardIssue.renderComponent();
    }
}
