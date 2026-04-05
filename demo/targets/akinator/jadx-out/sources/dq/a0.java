package dq;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import com.ironsource.C3191e4;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f52460b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f52461a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public a0() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.f52461a = executorServiceNewSingleThreadExecutor;
    }

    public final void a(Context context, Uri uri, ir.d dVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (uri == null) {
            d0.a("IntentLauncher", "launch - Uri is null", new Object[0]);
            cr.q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
        } else if (ir.q.isHttpUri(uri)) {
            this.f52461a.execute(new al.a(this, context.getApplicationContext(), uri, dVar, 22));
        } else if (uri.getScheme() != null) {
            cr.q.onUiThreadWithArgSafely(Boolean.valueOf(ir.g.openUrl(context, uri.toString())), dVar);
        } else {
            d0.a("IntentLauncher", "launch - Invalid uri: %s", uri);
            cr.q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
        }
    }

    public final void a(Context context, tm.n mraidCalendarEvent, ir.d dVar) {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidCalendarEvent, "mraidCalendarEvent");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "applicationContext");
        Intent intentPutExtra = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra("title", mraidCalendarEvent.getDescription()).putExtra("beginTime", mraidCalendarEvent.getStart().getTime());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(intentPutExtra, "Intent(Intent.ACTION_INS…CalendarEvent.start.time)");
        Date end = mraidCalendarEvent.getEnd();
        if (end != null) {
            intentPutExtra.putExtra("endTime", end.getTime());
        }
        String summary = mraidCalendarEvent.getSummary();
        if (summary != null) {
            intentPutExtra.putExtra("description", summary);
        }
        String location = mraidCalendarEvent.getLocation();
        if (location != null) {
            intentPutExtra.putExtra("eventLocation", location);
        }
        String status = mraidCalendarEvent.getStatus();
        int i11 = 0;
        if (status != null) {
            if (kotlin.jvm.internal.e0.areEqual(status, "confirmed")) {
                i10 = 1;
            } else {
                i10 = kotlin.jvm.internal.e0.areEqual(status, "cancelled") ? 2 : 0;
            }
            intentPutExtra.putExtra("eventStatus", i10);
        }
        String transparency = mraidCalendarEvent.getTransparency();
        if (transparency != null) {
            if (kotlin.jvm.internal.e0.areEqual(transparency, C3191e4.h.T)) {
                i11 = 1;
            } else if (!kotlin.jvm.internal.e0.areEqual(transparency, "opaque")) {
                i11 = 2;
            }
            intentPutExtra.putExtra("availability", i11);
        }
        String recurrence = mraidCalendarEvent.getRecurrence();
        if (recurrence != null) {
            intentPutExtra.putExtra("rrule", recurrence);
        }
        Intent flags = Intent.createChooser(intentPutExtra, "").setFlags(268435456);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(flags, "createChooser(intent, \"\"…t.FLAG_ACTIVITY_NEW_TASK)");
        try {
            applicationContext.startActivity(flags);
            cr.q.onUiThreadWithArgSafely(Boolean.TRUE, dVar);
        } catch (Exception e10) {
            d0.b(e10);
            cr.q.onUiThreadWithArgSafely(Boolean.FALSE, dVar);
        }
    }
}
