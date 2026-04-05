package zl;

import io.bidmachine.AdsFormat;
import java.util.EnumMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i {

    /* renamed from: d, reason: collision with root package name */
    public static final int f98237d = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f98238a = Executors.newScheduledThreadPool(f98237d);

    /* renamed from: b, reason: collision with root package name */
    public final EnumMap f98239b = new EnumMap(AdsFormat.class);

    /* renamed from: c, reason: collision with root package name */
    public final Object f98240c = new Object();
}
