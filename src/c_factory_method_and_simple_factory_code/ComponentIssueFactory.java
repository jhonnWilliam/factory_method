package c_factory_method_and_simple_factory_code;

import java.util.HashMap;
import java.util.Map;

public class ComponentIssueFactory {
    private static final Map<String, ComponentIssue> componentIssueMap = new HashMap<>();

    static {
        componentIssueMap.put("HBC", new ComponentIssuesHbc());
        componentIssueMap.put("History", new ComponentIssuesHistory());
        componentIssueMap.put("Recent", new ComponentIssuesRecent());
    }

    public static ComponentIssue getComponentIssue(String typeQuickCard) {
        return componentIssueMap.get(typeQuickCard);
    }
}
