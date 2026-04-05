package rm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tm.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements s {

    /* renamed from: a, reason: collision with root package name */
    public static final List f84516a = Arrays.asList("readFile", "writeFile", "readDefaults", "writeDefaults");

    @Override // tm.s
    public boolean checkParamsForCommand(String str, Map<String, String> map) {
        str.getClass();
        switch (str) {
            case "writeFile":
            case "writeDefaults":
                return map.containsKey("path") && map.containsKey("data");
            case "readFile":
            case "readDefaults":
                return map.containsKey("path");
            default:
                return true;
        }
    }

    @Override // tm.s
    public boolean isValidCommand(String str) {
        return f84516a.contains(str);
    }

    @Override // tm.s
    public String removePrefix(String str) {
        return str.substring(16);
    }
}
