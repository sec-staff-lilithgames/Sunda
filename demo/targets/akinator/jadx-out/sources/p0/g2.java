package p0;

import androidx.work.impl.WorkDatabase;
import com.ironsource.G5;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import o4.j;
import p0.n3;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class g2 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80220b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f80221c;

    public /* synthetic */ g2(Object obj, int i10) {
        this.f80220b = i10;
        this.f80221c = obj;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        CancellableContinuation cancellableContinuation;
        CancellableContinuation cancellableContinuation2 = null;
        switch (this.f80220b) {
            case 0:
                return Integer.valueOf(((h2) this.f80221c).f80233a.anchorIndex(((i2) obj).getAnchor$runtime()));
            case 1:
                return Boolean.valueOf(kotlin.jvm.internal.e0.areEqual(((l2) obj).getContainer(), (i2) this.f80221c));
            case 2:
                y0 y0Var = (y0) this.f80221c;
                n3.a aVar = n3.C;
                y0Var.recordReadOf(obj);
                return tu.x0.f87415a;
            case 3:
                n3 n3Var = (n3) this.f80221c;
                Throwable th2 = (Throwable) obj;
                n3.a aVar2 = n3.C;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th2);
                synchronized (n3Var.f80350c) {
                    try {
                        Job job = n3Var.f80351d;
                        if (job != null) {
                            n3Var.f80370w.setValue(o3.f80382c);
                            if (n3Var.f80367t) {
                                cancellableContinuation = n3Var.f80365r;
                                if (cancellableContinuation != null) {
                                }
                                n3Var.f80365r = null;
                                job.invokeOnCompletion(new androidx.lifecycle.c3(16, n3Var, th2));
                                cancellableContinuation2 = cancellableContinuation;
                            } else {
                                job.cancel(CancellationException);
                            }
                            cancellableContinuation = null;
                            n3Var.f80365r = null;
                            job.invokeOnCompletion(new androidx.lifecycle.c3(16, n3Var, th2));
                            cancellableContinuation2 = cancellableContinuation;
                        } else {
                            n3Var.f80352e = CancellationException;
                            n3Var.f80370w.setValue(o3.f80381b);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (cancellableContinuation2 != null) {
                    int i10 = tu.z.f87419c;
                    cancellableContinuation2.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
                }
                return tu.x0.f87415a;
            case 4:
                ((x4) this.f80221c).setValue(obj);
                return tu.x0.f87415a;
            case 5:
                z.v0 v0Var = (z.v0) this.f80221c;
                if (obj instanceof b1.x0) {
                    ((b1.x0) obj).m127recordReadInh_f27i8$runtime(b1.j.m117constructorimpl(4));
                }
                v0Var.add(obj);
                return tu.x0.f87415a;
            case 6:
                pw.s sVar = (pw.s) this.f80221c;
                pw.n0 it = (pw.n0) obj;
                int i11 = pw.s.f81977f;
                kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                return sVar.onPathResult(it, "listRecursively");
            case 7:
                return Boolean.valueOf(((Class) this.f80221c).isInstance(obj));
            case 8:
                rv.t tVar = (rv.t) this.f80221c;
                if (obj != null) {
                    return obj;
                }
                throw new IllegalArgumentException("null element found in " + tVar + '.');
            case 9:
                kv.p pVar = (kv.p) this.f80221c;
                uu.g1 it2 = (uu.g1) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it2, "it");
                Boolean bool = (Boolean) pVar.invoke(Integer.valueOf(it2.getIndex()), it2.getValue());
                bool.booleanValue();
                return bool;
            case 10:
                return Boolean.valueOf(uu.k0.contains((Object[]) this.f80221c, obj));
            case 11:
                return ((sv.v) this.f80221c).get(((Integer) obj).intValue());
            case 12:
                Locale locale = (Locale) this.f80221c;
                y5.c db2 = (y5.c) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db2, "db");
                db2.setLocale(locale);
                return tu.x0.f87415a;
            case 13:
                return obj == ((uu.a) this.f80221c) ? "(this Collection)" : String.valueOf(obj);
            case 14:
                uu.m mVar = (uu.m) this.f80221c;
                Map.Entry it3 = (Map.Entry) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it3, "it");
                StringBuilder sb2 = new StringBuilder();
                Object key = it3.getKey();
                sb2.append(key == mVar ? "(this Map)" : String.valueOf(key));
                sb2.append(G5.T);
                Object value = it3.getValue();
                sb2.append(value != mVar ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 15:
                UUID uuid = (UUID) this.f80221c;
                WorkDatabase db3 = (WorkDatabase) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db3, "db");
                v6.c0 c0VarWorkSpecDao = db3.workSpecDao();
                String string = uuid.toString();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
                b0.c workStatusPojoForId = c0VarWorkSpecDao.getWorkStatusPojoForId(string);
                if (workStatusPojoForId != null) {
                    return workStatusPojoForId.toWorkInfo();
                }
                return null;
            case 16:
                n6.a1 a1Var = (n6.a1) this.f80221c;
                WorkDatabase db4 = (WorkDatabase) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(db4, "db");
                Object objApply = v6.b0.B.apply(db4.rawWorkInfoDao().getWorkInfoPojos(w6.x.toRawQuery(a1Var)));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(objApply, "apply(...)");
                return (List) objApply;
            default:
                zi.j jVar = (zi.j) this.f80221c;
                o4.d dVar = (o4.d) obj;
                j.a aVar3 = zi.j.f97995b;
                jVar.getClass();
                j.a aVar4 = zi.j.f97996c;
                long j10 = 0;
                for (Map.Entry<j.a, Object> entry : dVar.asMap().entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        j.a key2 = entry.getKey();
                        Set set = (Set) entry.getValue();
                        String strB = jVar.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            Object[] objArr = {strB};
                            HashSet hashSet = new HashSet(1);
                            Object obj2 = objArr[0];
                            Objects.requireNonNull(obj2);
                            if (!hashSet.add(obj2)) {
                                throw new IllegalArgumentException(j1.o2.j(obj2, "duplicate element: "));
                            }
                            dVar.set(key2, Collections.unmodifiableSet(hashSet));
                            j10++;
                        } else {
                            dVar.remove(key2);
                        }
                    }
                }
                if (j10 == 0) {
                    dVar.remove(aVar4);
                } else {
                    dVar.set(aVar4, Long.valueOf(j10));
                }
                return null;
        }
    }
}
