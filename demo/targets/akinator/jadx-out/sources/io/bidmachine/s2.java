package io.bidmachine;

import android.content.Context;
import com.explorestack.protobuf.Struct;
import com.explorestack.protobuf.Value;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class s2 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f62003i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f62004j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f62005k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f62006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f62007b;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedList f62010e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList f62011f;

    /* renamed from: g, reason: collision with root package name */
    public v2 f62012g;

    /* renamed from: h, reason: collision with root package name */
    public long f62013h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final BidMachineTrackingObject f62008c = new BidMachineTrackingObject();

    /* renamed from: d, reason: collision with root package name */
    public final a f62009d = new a(this);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final WeakReference f62014b;

        public a(s2 s2Var) {
            this.f62014b = new WeakReference(s2Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            s2 s2Var = (s2) this.f62014b.get();
            if (s2Var != null) {
                s2Var.f62008c.eventStart(TrackEventType.InitLoading, null);
                nm.j.onBackgroundThread(new r2(s2Var));
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f62003i = timeUnit.toMillis(2L);
        f62004j = timeUnit.toMillis(128L);
    }

    public s2(Context context, String str, Queue<String> queue) {
        this.f62006a = context;
        this.f62007b = str;
        this.f62010e = new LinkedList(queue);
        this.f62011f = new LinkedList(queue);
    }

    public static Value a(String str, String str2, String str3) {
        Value valueBuild = Value.newBuilder().setStringValue(str).build();
        Value valueBuild2 = Value.newBuilder().setStringValue(str2).build();
        return Value.newBuilder().setStructValue(Struct.newBuilder().putFields("network", valueBuild).putFields("network_version", valueBuild2).putFields("network_adapter_version", Value.newBuilder().setStringValue(str3).build()).build()).build();
    }
}
