package rm;

import android.text.TextUtils;
import com.ironsource.sdk.controller.f;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tm.d0;
import tm.s0;
import tm.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f84515a = new CopyOnWriteArrayList();

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = f84515a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.isHandled(str)) {
                return aVar;
            }
        }
        return null;
    }

    public static boolean addBridge(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = f84515a;
        return !copyOnWriteArrayList.contains(aVar) && copyOnWriteArrayList.add(aVar);
    }

    public static void handleJsCommand(s0 s0Var, String str) {
        Map<String, String> commandUrl;
        t.d("JsBridgeHandler", "handleJsCommand - %s", str);
        try {
            a aVarA = a(str);
            if (aVarA == null || (commandUrl = d0.parseCommandUrl(str, aVarA.getJsValidator())) == null) {
                return;
            }
            String str2 = commandUrl.get(f.b.f38561g);
            if (str2 == null) {
                t.w("JsBridgeHandler", "handleJsCommand not found", new Object[0]);
            } else {
                aVarA.runJsCommand(s0Var, str2, commandUrl);
            }
        } catch (Throwable th2) {
            t.e("JsBridgeHandler", th2);
        }
    }

    public static boolean isHandled(String str) {
        return a(str) != null;
    }

    public static String obtainJs() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = f84515a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append("<script type='application/javascript'>");
            sb2.append(aVar.getJs());
            sb2.append("</script>");
        }
        return sb2.toString();
    }

    public static boolean removeBridge(a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = f84515a;
        return copyOnWriteArrayList.contains(aVar) && copyOnWriteArrayList.remove(aVar);
    }
}
