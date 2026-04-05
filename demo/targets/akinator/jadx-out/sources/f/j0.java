package f;

import android.content.res.Resources;
import androidx.work.b;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;
import lb.e;
import o5.j2;
import o9.s;
import qw.o;
import t5.r;
import tu.x0;
import uu.b2;
import uu.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f55230b;

    public /* synthetic */ j0(int i10) {
        this.f55230b = i10;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        int i10 = this.f55230b;
        x0 x0Var = x0.f87415a;
        switch (i10) {
            case 0:
                Resources resources = (Resources) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 1:
                return CoroutineDispatcher.Key._init_$lambda$0((zu.k) obj);
            case 2:
                return ExecutorCoroutineDispatcher.Key._init_$lambda$0((zu.k) obj);
            case 3:
                return Boolean.valueOf(DebugProbesImpl.dumpCoroutinesSynchronized$lambda$14((DebugProbesImpl.CoroutineOwner) obj));
            case 4:
                return SerialDescriptorsKt.buildClassSerialDescriptor$lambda$0((ClassSerialDescriptorBuilder) obj);
            case 5:
                return SerialDescriptorsKt.buildSerialDescriptor$lambda$6((ClassSerialDescriptorBuilder) obj);
            case 6:
                return JsonElementSerializer.descriptor$lambda$5((ClassSerialDescriptorBuilder) obj);
            case 7:
                return JsonObject.toString$lambda$1((Map.Entry) obj);
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                b.C0007b c0007b = androidx.work.b.f7480b;
                kotlin.jvm.internal.e0.checkNotNullParameter(entry, "<destruct>");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbT = a.b.t(str, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "toString(...)");
                }
                sbT.append(value);
                return sbT.toString();
            case 9:
                kotlin.jvm.internal.e0.checkNotNullParameter((x5.d) obj, "it");
                return x0Var;
            case 10:
                x5.d it = (x5.d) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.step());
            case 11:
                x5.d statement = (x5.d) obj;
                j2.a aVar = j2.f77597l;
                kotlin.jvm.internal.e0.checkNotNullParameter(statement, "statement");
                Set setCreateSetBuilder = b2.createSetBuilder();
                while (statement.step()) {
                    setCreateSetBuilder.add(Integer.valueOf((int) statement.getLong(0)));
                }
                return b2.build(setCreateSetBuilder);
            case 12:
                s.a aVar2 = o9.s.f78491t;
                ((Throwable) obj).printStackTrace();
                return x0Var;
            case 13:
                e.d it2 = (e.d) obj;
                int i11 = qb.c.f82661o;
                kotlin.jvm.internal.e0.checkNotNullParameter(it2, "it");
                return String.valueOf(it2.getIndex());
            case 14:
                qw.q entry2 = (qw.q) obj;
                o.a aVar3 = qw.o.f83597h;
                kotlin.jvm.internal.e0.checkNotNullParameter(entry2, "entry");
                return Boolean.valueOf(o.a.access$keepPath(qw.o.f83597h, entry2.getCanonicalPath()));
            case 15:
                kotlin.jvm.internal.e0.checkNotNullParameter((qw.q) obj, "it");
                return Boolean.TRUE;
            case 16:
                s6.f it3 = (s6.f) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it3, "it");
                String simpleName = it3.getClass().getSimpleName();
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
                return simpleName;
            case 17:
                int i12 = ra.h.f84068k;
                return x0Var;
            case 18:
                rv.t it4 = (rv.t) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it4, "it");
                return it4.iterator();
            case 19:
                Iterable it5 = (Iterable) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it5, "it");
                return it5.iterator();
            case 20:
                g1 it6 = (g1) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it6, "it");
                return it6.getValue();
            case 21:
                return Boolean.valueOf(obj == null);
            case 22:
                String line = (String) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(line, "line");
                return line;
            case 23:
                CharSequence it7 = (CharSequence) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it7, "it");
                return it7.toString();
            case 24:
                CharSequence it8 = (CharSequence) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it8, "it");
                return it8.toString();
            case 25:
                CharSequence it9 = (CharSequence) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(it9, "it");
                return it9.toString();
            case 26:
                kotlin.jvm.internal.e0.checkNotNullParameter((y5.c) obj, "it");
                return null;
            case 27:
                y5.j obj2 = (y5.j) obj;
                int i13 = r.b.f86363j;
                kotlin.jvm.internal.e0.checkNotNullParameter(obj2, "obj");
                return Long.valueOf(obj2.simpleQueryForLong());
            case 28:
                y5.j obj3 = (y5.j) obj;
                int i14 = r.b.f86363j;
                kotlin.jvm.internal.e0.checkNotNullParameter(obj3, "obj");
                return obj3.simpleQueryForString();
            default:
                y5.j obj4 = (y5.j) obj;
                int i15 = r.b.f86363j;
                kotlin.jvm.internal.e0.checkNotNullParameter(obj4, "obj");
                return Integer.valueOf(obj4.executeUpdateDelete());
        }
    }
}
