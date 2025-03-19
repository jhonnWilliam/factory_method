package c_factory_method_and_simple_factory_code;

public abstract class ComponentIssue {
    public abstract QuickCardIssues createQuickCardIssue();

    public void showComponentIssue() {
        QuickCardIssues quickCardIssue = this.createQuickCardIssue();
        quickCardIssue.renderComponent();
    }
}
