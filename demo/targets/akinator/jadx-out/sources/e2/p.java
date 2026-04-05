package e2;

import a2.z3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements u0, Iterable, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f53599b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public boolean f53600c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f53601e;

    public final void collapsePeer$ui_release(p peer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(peer, "peer");
        if (peer.f53600c) {
            this.f53600c = true;
        }
        if (peer.f53601e) {
            this.f53601e = true;
        }
        for (Map.Entry entry : peer.f53599b.entrySet()) {
            t0 t0Var = (t0) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.f53599b;
            if (!linkedHashMap.containsKey(t0Var)) {
                linkedHashMap.put(t0Var, value);
            } else if (value instanceof a) {
                Object obj = linkedHashMap.get(t0Var);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                }
                a aVar = (a) obj;
                String label = aVar.getLabel();
                if (label == null) {
                    label = ((a) value).getLabel();
                }
                tu.i action = aVar.getAction();
                if (action == null) {
                    action = ((a) value).getAction();
                }
                linkedHashMap.put(t0Var, new a(label, action));
            } else {
                continue;
            }
        }
    }

    public final <T> boolean contains(t0 key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        return this.f53599b.containsKey(key);
    }

    public final p copy() {
        p pVar = new p();
        pVar.f53600c = this.f53600c;
        pVar.f53601e = this.f53601e;
        pVar.f53599b.putAll(this.f53599b);
        return pVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f53599b, pVar.f53599b) && this.f53600c == pVar.f53600c && this.f53601e == pVar.f53601e;
    }

    public final <T> T get(t0 key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        T t10 = (T) this.f53599b.get(key);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    public final <T> T getOrElse(t0 key, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        T t10 = (T) this.f53599b.get(key);
        return t10 == null ? (T) defaultValue.invoke() : t10;
    }

    public final <T> T getOrElseNullable(t0 key, kv.a defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        T t10 = (T) this.f53599b.get(key);
        return t10 == null ? (T) defaultValue.invoke() : t10;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f53601e) + com.google.android.gms.internal.play_billing.a.c(this.f53599b.hashCode() * 31, 31, this.f53600c);
    }

    public final boolean isClearingSemantics() {
        return this.f53601e;
    }

    public final boolean isMergingSemanticsOfDescendants() {
        return this.f53600c;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<t0, Object>> iterator() {
        return this.f53599b.entrySet().iterator();
    }

    public final void mergeChild$ui_release(p child) {
        kotlin.jvm.internal.e0.checkNotNullParameter(child, "child");
        for (Map.Entry entry : child.f53599b.entrySet()) {
            t0 t0Var = (t0) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = this.f53599b;
            Object objMerge = t0Var.merge(linkedHashMap.get(t0Var), value);
            if (objMerge != null) {
                linkedHashMap.put(t0Var, objMerge);
            }
        }
    }

    @Override // e2.u0
    public <T> void set(t0 key, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        this.f53599b.put(key, t10);
    }

    public final void setClearingSemantics(boolean z10) {
        this.f53601e = z10;
    }

    public final void setMergingSemanticsOfDescendants(boolean z10) {
        this.f53600c = z10;
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f53600c) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f53601e) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f53599b.entrySet()) {
            t0 t0Var = (t0) entry.getKey();
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(t0Var.getName());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return z3.simpleIdentityToString(this, null) + "{ " + ((Object) sb2) + " }";
    }
}
