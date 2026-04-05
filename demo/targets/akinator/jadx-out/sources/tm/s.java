package tm;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface s {
    boolean checkParamsForCommand(String str, Map<String, String> map);

    boolean isValidCommand(String str);

    String removePrefix(String str);
}
