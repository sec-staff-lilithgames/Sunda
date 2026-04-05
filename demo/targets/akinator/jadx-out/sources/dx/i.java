package dx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i implements ILoggerFactory {

    /* renamed from: a, reason: collision with root package name */
    public boolean f52945a = false;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f52946b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f52947c = new LinkedBlockingQueue();

    public void clear() {
        this.f52946b.clear();
        this.f52947c.clear();
    }

    public LinkedBlockingQueue<cx.d> getEventQueue() {
        return this.f52947c;
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized bx.a getLogger(String str) {
        h hVar;
        hVar = (h) this.f52946b.get(str);
        if (hVar == null) {
            hVar = new h(str, this.f52947c, this.f52945a);
            this.f52946b.put(str, hVar);
        }
        return hVar;
    }

    public List<String> getLoggerNames() {
        return new ArrayList(this.f52946b.keySet());
    }

    public List<h> getLoggers() {
        return new ArrayList(this.f52946b.values());
    }

    public void postInitialization() {
        this.f52945a = true;
    }
}
