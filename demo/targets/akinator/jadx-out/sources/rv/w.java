package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kv.p f85108a;

        public a(kv.p pVar) {
            this.f85108a = pVar;
        }

        @Override // rv.t
        public Iterator<T> iterator() {
            return w.iterator(this.f85108a);
        }
    }

    public static <T> Iterator<T> iterator(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        u uVar = new u();
        uVar.setNextStep(av.b.createCoroutineUnintercepted(block, uVar, uVar));
        return uVar;
    }

    public static <T> t sequence(kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        return new a(block);
    }
}
