package k6;

import android.os.Handler;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {
    public abstract void close();

    public abstract WebMessagePort getFrameworkPort();

    public abstract InvocationHandler getInvocationHandler();

    public abstract void postMessage(l lVar);

    public abstract void setWebMessageCallback(Handler handler, a aVar);

    public abstract void setWebMessageCallback(a aVar);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public void onMessage(m mVar, l lVar) {
        }
    }
}
