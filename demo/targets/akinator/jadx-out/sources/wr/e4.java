package wr;

import com.ironsource.C3191e4;
import com.ironsource.G5;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e4 {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f90904c = Logger.getLogger(e4.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final r3 f90905d = new r3();

    /* renamed from: e, reason: collision with root package name */
    public static final ph.o f90906e = ph.o.base64().omitPadding();

    /* renamed from: a, reason: collision with root package name */
    public Object[] f90907a;

    /* renamed from: b, reason: collision with root package name */
    public int f90908b;

    public e4(int i10, Object[] objArr) {
        this.f90908b = i10;
        this.f90907a = objArr;
    }

    public final void a(int i10) {
        Object[] objArr = new Object[i10];
        if (!b()) {
            System.arraycopy(this.f90907a, 0, objArr, 0, this.f90908b * 2);
        }
        this.f90907a = objArr;
    }

    public final boolean b() {
        return this.f90908b == 0;
    }

    public final void c() {
        int i10 = this.f90908b;
        int i11 = i10 * 2;
        if (i11 != 0) {
            Object[] objArr = this.f90907a;
            if (i11 != (objArr != null ? objArr.length : 0)) {
                return;
            }
        }
        a(Math.max(i10 * 4, 8));
    }

    public boolean containsKey(z3 z3Var) {
        for (int i10 = 0; i10 < this.f90908b; i10++) {
            if (Arrays.equals(z3Var.f91225c, d(i10))) {
                return true;
            }
        }
        return false;
    }

    public final byte[] d(int i10) {
        return (byte[]) this.f90907a[i10 * 2];
    }

    public <T> void discardAll(z3 z3Var) {
        if (b()) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = this.f90908b;
            if (i10 >= i12) {
                Arrays.fill(this.f90907a, i11 * 2, i12 * 2, (Object) null);
                this.f90908b = i11;
                return;
            }
            if (!Arrays.equals(z3Var.f91225c, d(i10))) {
                this.f90907a[i11 * 2] = d(i10);
                f(i11, e(i10));
                i11++;
            }
            i10++;
        }
    }

    public final Object e(int i10) {
        return this.f90907a[(i10 * 2) + 1];
    }

    public final void f(int i10, Object obj) {
        Object[] objArr = this.f90907a;
        if (objArr instanceof byte[][]) {
            a(objArr != null ? objArr.length : 0);
        }
        this.f90907a[(i10 * 2) + 1] = obj;
    }

    public final Object g(int i10, z3 z3Var) {
        Object objE = e(i10);
        if (objE instanceof byte[]) {
            return z3Var.a((byte[]) objE);
        }
        b4 b4Var = (b4) objE;
        b4Var.getClass();
        if (z3Var instanceof a4) {
            Object obj = z3Var.f91226d;
            if ((w3.class.isInstance(obj) ? w3.class.cast(obj) : null) != null) {
                throw new ClassCastException();
            }
        }
        synchronized (b4Var) {
            throw null;
        }
    }

    public <T> T get(z3 z3Var) {
        for (int i10 = this.f90908b - 1; i10 >= 0; i10--) {
            if (Arrays.equals(z3Var.f91225c, d(i10))) {
                return (T) g(i10, z3Var);
            }
        }
        return null;
    }

    public <T> Iterable<T> getAll(z3 z3Var) {
        for (int i10 = 0; i10 < this.f90908b; i10++) {
            if (Arrays.equals(z3Var.f91225c, d(i10))) {
                return new y3(this, z3Var, i10);
            }
        }
        return null;
    }

    public Set<String> keys() {
        if (b()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(this.f90908b);
        for (int i10 = 0; i10 < this.f90908b; i10++) {
            hashSet.add(new String(d(i10), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public void merge(e4 e4Var) {
        if (e4Var.b()) {
            return;
        }
        Object[] objArr = this.f90907a;
        int length = (objArr != null ? objArr.length : 0) - (this.f90908b * 2);
        if (b() || length < e4Var.f90908b * 2) {
            a((e4Var.f90908b * 2) + (this.f90908b * 2));
        }
        System.arraycopy(e4Var.f90907a, 0, this.f90907a, this.f90908b * 2, e4Var.f90908b * 2);
        this.f90908b += e4Var.f90908b;
    }

    public <T> void put(z3 z3Var, T t10) {
        mh.p1.checkNotNull(z3Var, C3191e4.h.W);
        mh.p1.checkNotNull(t10, "value");
        c();
        int i10 = this.f90908b;
        this.f90907a[i10 * 2] = z3Var.f91225c;
        if (z3Var instanceof a4) {
            Object obj = z3Var.f91226d;
            if ((w3.class.isInstance(obj) ? w3.class.cast(obj) : null) != null) {
                throw new ClassCastException();
            }
            if (mh.p1.checkNotNull(null) != null) {
                throw new ClassCastException();
            }
            f(i10, new b4(t10));
        } else {
            this.f90907a[(i10 * 2) + 1] = z3Var.b(t10);
        }
        this.f90908b++;
    }

    public <T> boolean remove(z3 z3Var, T t10) {
        mh.p1.checkNotNull(z3Var, C3191e4.h.W);
        mh.p1.checkNotNull(t10, "value");
        for (int i10 = 0; i10 < this.f90908b; i10++) {
            if (Arrays.equals(z3Var.f91225c, d(i10)) && t10.equals(g(i10, z3Var))) {
                int i11 = i10 * 2;
                int i12 = (i10 + 1) * 2;
                int i13 = (this.f90908b * 2) - i12;
                Object[] objArr = this.f90907a;
                System.arraycopy(objArr, i12, objArr, i11, i13);
                int i14 = this.f90908b - 1;
                this.f90908b = i14;
                Object[] objArr2 = this.f90907a;
                objArr2[i14 * 2] = null;
                objArr2[(i14 * 2) + 1] = null;
                return true;
            }
        }
        return false;
    }

    public <T> Iterable<T> removeAll(z3 z3Var) {
        if (b()) {
            return null;
        }
        int i10 = 0;
        int i11 = 0;
        ArrayList arrayList = null;
        while (true) {
            int i12 = this.f90908b;
            if (i10 >= i12) {
                Arrays.fill(this.f90907a, i11 * 2, i12 * 2, (Object) null);
                this.f90908b = i11;
                return arrayList;
            }
            if (Arrays.equals(z3Var.f91225c, d(i10))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(g(i10, z3Var));
            } else {
                this.f90907a[i11 * 2] = d(i10);
                f(i11, e(i10));
                i11++;
            }
            i10++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Metadata(");
        for (int i10 = 0; i10 < this.f90908b; i10++) {
            if (i10 != 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            byte[] bArrD = d(i10);
            Charset charset = mh.h0.f74626a;
            String str = new String(bArrD, charset);
            sb2.append(str);
            sb2.append(G5.T);
            if (str.endsWith("-bin")) {
                ph.o oVar = f90906e;
                Object objE = e(i10);
                if (!(objE instanceof byte[])) {
                    synchronized (((b4) objE)) {
                        throw null;
                    }
                }
                sb2.append(oVar.encode((byte[]) objE));
            } else {
                Object objE2 = e(i10);
                if (!(objE2 instanceof byte[])) {
                    synchronized (((b4) objE2)) {
                        throw null;
                    }
                }
                sb2.append(new String((byte[]) objE2, charset));
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public e4() {
    }

    public void merge(e4 e4Var, Set<z3> set) {
        mh.p1.checkNotNull(e4Var, "other");
        HashMap map = new HashMap(set.size());
        for (z3 z3Var : set) {
            map.put(ByteBuffer.wrap(z3Var.f91225c), z3Var);
        }
        for (int i10 = 0; i10 < e4Var.f90908b; i10++) {
            if (map.containsKey(ByteBuffer.wrap(e4Var.d(i10)))) {
                c();
                this.f90907a[this.f90908b * 2] = e4Var.d(i10);
                f(this.f90908b, e4Var.e(i10));
                this.f90908b++;
            }
        }
    }
}
