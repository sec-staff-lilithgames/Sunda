package ic;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends ConcurrentHashMap {

    /* renamed from: c, reason: collision with root package name */
    public static final i f59487c = new i();

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f59488b;

    public i() {
        this(280, 0.8f, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String intern(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 280) {
            ReentrantLock reentrantLock = this.f59488b;
            if (reentrantLock.tryLock()) {
                try {
                    if (size() >= 280) {
                        clear();
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }

    public i(int i10, float f10, int i11) {
        super(i10, f10, i11);
        this.f59488b = new ReentrantLock();
    }
}
