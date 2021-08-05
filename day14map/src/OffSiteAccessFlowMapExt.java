import java.util.List;
import java.util.Map;

public class OffSiteAccessFlowMapExt {
    //信息
    private String msg;

    //数据
    private List<Map<String, Object>> values;

    public OffSiteAccessFlowMapExt(String msg, List<Map<String, Object>> values) {
        this.msg = msg;
        this.values = values;
    }

    public OffSiteAccessFlowMapExt() {
        super();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Map<String, Object>> getValues() {
        return values;
    }

    public void setValues(List<Map<String, Object>> values) {
        this.values = values;
    }
}
