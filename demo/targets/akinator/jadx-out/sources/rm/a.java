package rm;

import java.util.Map;
import tm.s;
import tm.s0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a {
    String getJs();

    s getJsValidator();

    boolean isHandled(String str);

    void runJsCommand(s0 s0Var, String str, Map<String, String> map);
}
