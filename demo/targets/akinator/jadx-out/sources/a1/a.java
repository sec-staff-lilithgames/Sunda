package a1;

import b1.d0;
import b1.l0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import io.ktor.client.plugins.HttpRequestRetry;
import io.ktor.client.request.HttpRequestBuilder;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt;
import kotlinx.coroutines.future.FutureKt;
import p0.i4;
import p0.j2;
import p0.k3;
import p0.k4;
import p0.n3;
import p0.o3;
import p0.y4;
import p0.z4;
import tu.x0;
import tu.z;
import uu.o0;
import uu.p0;
import uu.y0;
import z.o1;
import z.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3387c;

    public /* synthetic */ a(Object obj, int i10) {
        this.f3386b = i10;
        this.f3387c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        Collection collectionPlus;
        char c10;
        long j10;
        char c11;
        long j11;
        CancellableContinuation cancellableContinuationC = null;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        switch (this.f3386b) {
            case 0:
                m mVar = (m) this.f3387c;
                r rVar = (r) obj;
                j2 j2Var = (j2) obj2;
                if (!(j2Var instanceof d0)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                d0 d0Var = (d0) j2Var;
                Object objSave = ((p) mVar).save(rVar, d0Var.getValue());
                if (objSave == null) {
                    return null;
                }
                y4 policy = d0Var.getPolicy();
                e0.checkNotNull(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return z4.mutableStateOf(objSave, policy);
            case 1:
                l0 l0Var = (l0) this.f3387c;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = l0Var.f8629b;
                while (true) {
                    Object obj3 = atomicReference.get();
                    if (obj3 == null) {
                        collectionPlus = collection;
                    } else if (obj3 instanceof Set) {
                        collectionPlus = p0.listOf((Object[]) new Set[]{obj3, collection});
                    } else {
                        if (!(obj3 instanceof List)) {
                            p0.d0.composeRuntimeError("Unexpected notification");
                            throw new tu.k();
                        }
                        collectionPlus = y0.plus((Collection) obj3, (Iterable) o0.listOf(collection));
                    }
                    while (!atomicReference.compareAndSet(obj3, collectionPlus)) {
                        if (atomicReference.get() != obj3) {
                            break;
                        }
                    }
                    if (l0Var.a()) {
                        l0Var.f8628a.invoke(new e(l0Var, 3));
                    }
                    return x0.f87415a;
                    break;
                }
            case 2:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c) this.f3387c, (HttpRequestRetry.ModifyRequestContext) obj, (HttpRequestBuilder) obj2);
            case 3:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d) this.f3387c, (HttpRequestRetry.ModifyRequestContext) obj, (HttpRequestBuilder) obj2);
            case 4:
                return c.a.a((ProducerScope) this.f3387c, (File) obj, (d.C0412d) obj2);
            case 5:
                return b.C0469b.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h) this.f3387c, (i1.h) obj, (i1.h) obj2);
            case 6:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) this.f3387c, (a.c) obj, (a.c.EnumC0490a) obj2);
            case 7:
                return Integer.valueOf(SafeCollector_commonKt.checkContext$lambda$0((SafeCollector) this.f3387c, ((Integer) obj).intValue(), (zu.k) obj2));
            case 8:
                return FutureKt.asDeferred$lambda$5((CompletableDeferred) this.f3387c, obj, (Throwable) obj2);
            case 9:
                i4 i4Var = (i4) this.f3387c;
                ((Integer) obj).intValue();
                if (obj2 instanceof k4) {
                    i4Var.forgetting((k4) obj2);
                }
                if (obj2 instanceof k3) {
                    ((k3) obj2).release();
                }
                return x0.f87415a;
            case 10:
                n3 n3Var = (n3) this.f3387c;
                Set set = (Set) obj;
                synchronized (n3Var.f80350c) {
                    try {
                        if (((o3) n3Var.f80370w.getValue()).compareTo(o3.f80385g) >= 0) {
                            v0 v0Var = n3Var.f80355h;
                            if (set instanceof r0.f) {
                                o1 set$runtime = ((r0.f) set).getSet$runtime();
                                Object[] objArr = set$runtime.f96888b;
                                long[] jArr = set$runtime.f96887a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        long j13 = jArr[i10];
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                                            for (int i12 = 0; i12 < i11; i12++) {
                                                if ((j13 & 255) < 128) {
                                                    Object obj4 = objArr[(i10 << 3) + i12];
                                                    if (!(obj4 instanceof b1.x0) || ((b1.x0) obj4).m126isReadInh_f27i8$runtime(b1.j.m117constructorimpl(1))) {
                                                        v0Var.add(obj4);
                                                    }
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i11 == 8) {
                                            }
                                        }
                                        if (i10 != length) {
                                            i10++;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj5 : set) {
                                    if (!(obj5 instanceof b1.x0) || ((b1.x0) obj5).m126isReadInh_f27i8$runtime(b1.j.m117constructorimpl(1))) {
                                        v0Var.add(obj5);
                                    }
                                }
                            }
                            cancellableContinuationC = n3Var.c();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuationC != null) {
                    int i13 = z.f87419c;
                    cancellableContinuationC.resumeWith(z.m7131constructorimpl(x0.f87415a));
                }
                return x0.f87415a;
            default:
                Channel channel = (Channel) this.f3387c;
                Set set2 = (Set) obj;
                if (set2 instanceof r0.f) {
                    o1 set$runtime2 = ((r0.f) set2).getSet$runtime();
                    Object[] objArr2 = set$runtime2.f96888b;
                    long[] jArr2 = set$runtime2.f96887a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j14 = jArr2[i14];
                            if ((((~j14) << c12) & j14 & j12) != j12) {
                                int i15 = 8 - ((~(i14 - length2)) >>> 31);
                                int i16 = 0;
                                while (i16 < i15) {
                                    if ((j14 & 255) < 128) {
                                        c11 = c12;
                                        Object obj6 = objArr2[(i14 << 3) + i16];
                                        j11 = j12;
                                        if (!(obj6 instanceof b1.x0) || ((b1.x0) obj6).m126isReadInh_f27i8$runtime(b1.j.m117constructorimpl(4))) {
                                        }
                                    } else {
                                        c11 = c12;
                                        j11 = j12;
                                    }
                                    j14 >>= 8;
                                    i16++;
                                    c12 = c11;
                                    j12 = j11;
                                }
                                c10 = c12;
                                j10 = j12;
                                if (i15 == 8) {
                                }
                            } else {
                                c10 = c12;
                                j10 = j12;
                            }
                            if (i14 != length2) {
                                i14++;
                                c12 = c10;
                                j12 = j10;
                            }
                        }
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj7 : set3) {
                            if (!(obj7 instanceof b1.x0) || ((b1.x0) obj7).m126isReadInh_f27i8$runtime(b1.j.m117constructorimpl(4))) {
                                channel.mo5139trySendJP2dKIU(set2);
                            }
                        }
                    }
                }
                return x0.f87415a;
        }
    }
}
