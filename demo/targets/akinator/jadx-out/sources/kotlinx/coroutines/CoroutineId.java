package kotlinx.coroutines;

import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;
import sv.n0;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CoroutineId extends zu.a implements ThreadContextElement<String> {
    public static final Key Key = new Key(null);

    /* renamed from: id, reason: collision with root package name */
    private final long f71867id;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key implements l {
        public /* synthetic */ Key(u uVar) {
            this();
        }

        private Key() {
        }
    }

    public CoroutineId(long j10) {
        super(Key);
        this.f71867id = j10;
    }

    public static /* synthetic */ CoroutineId copy$default(CoroutineId coroutineId, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = coroutineId.f71867id;
        }
        return coroutineId.copy(j10);
    }

    public final long component1() {
        return this.f71867id;
    }

    public final CoroutineId copy(long j10) {
        return new CoroutineId(j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineId) && this.f71867id == ((CoroutineId) obj).f71867id;
    }

    public final long getId() {
        return this.f71867id;
    }

    public int hashCode() {
        return Long.hashCode(this.f71867id);
    }

    public String toString() {
        return g.n(new StringBuilder("CoroutineId("), this.f71867id, ')');
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public void restoreThreadContext(m mVar, String str) {
        Thread.currentThread().setName(str);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public String updateThreadContext(m mVar) {
        String name;
        CoroutineName coroutineName = (CoroutineName) mVar.get(CoroutineName.Key);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            name = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        int iLastIndexOf$default = n0.lastIndexOf$default((CharSequence) name2, " @", 0, false, 6, (Object) null);
        if (iLastIndexOf$default < 0) {
            iLastIndexOf$default = name2.length();
        }
        StringBuilder sb2 = new StringBuilder(o2.C(iLastIndexOf$default, 10, name));
        String strSubstring = name2.substring(0, iLastIndexOf$default);
        e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb2.append(strSubstring);
        sb2.append(" @");
        sb2.append(name);
        sb2.append('#');
        sb2.append(this.f71867id);
        threadCurrentThread.setName(sb2.toString());
        return name2;
    }
}
