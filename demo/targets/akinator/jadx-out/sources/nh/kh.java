package nh;

import java.util.Spliterator;
import java.util.function.Consumer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class kh extends wh implements Consumer {

    /* renamed from: c, reason: collision with root package name */
    public Object f76429c;

    @Override // nh.wh
    public final wh a(Spliterator spliterator, long j10) {
        return new kh(spliterator, j10);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        this.f76429c = obj;
    }

    @Override // java.util.Spliterator
    public boolean tryAdvance(Consumer<Object> consumer) {
        if (!this.f76746a.tryAdvance(this)) {
            return false;
        }
        try {
            this.f76747b++;
            throw null;
        } catch (Throwable th2) {
            this.f76429c = null;
            throw th2;
        }
    }
}
