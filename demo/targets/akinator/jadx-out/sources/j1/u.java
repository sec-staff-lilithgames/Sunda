package j1;

import android.adservices.measurement.MeasurementManager;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.Person;
import android.os.Bundle;
import io.bidmachine.Function;
import io.bidmachine.LabelData;
import io.bidmachine.PrivacySheetData;
import io.odeeo.internal.b.g;
import io.odeeo.internal.b0.a;
import io.odeeo.internal.q0.o;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.net.URL;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements g.a, sd.c, Function, ko.t, o.b, we.g, li.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f68988b;

    public /* synthetic */ u(int i10) {
        this.f68988b = i10;
    }

    public static /* bridge */ /* synthetic */ MeasurementManager b(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannel c(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup d(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* bridge */ /* synthetic */ Person e(Object obj) {
        return (Person) obj;
    }

    public static /* bridge */ /* synthetic */ MethodHandles.Lookup g(Object obj) {
        return (MethodHandles.Lookup) obj;
    }

    public static /* bridge */ /* synthetic */ Class j() {
        return MethodHandles.Lookup.class;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return MeasurementManager.class;
    }

    @Override // io.bidmachine.Function
    public Object apply(Object obj) {
        switch (this.f68988b) {
            case 13:
                return (LabelData) obj;
            default:
                return (PrivacySheetData) obj;
        }
    }

    @Override // we.g
    public boolean evaluate(int i10, int i11, int i12, int i13, int i14) {
        if (i11 == 67 && i12 == 79 && i13 == 77 && (i14 == 77 || i10 == 2)) {
            return true;
        }
        if (i11 == 77 && i12 == 76 && i13 == 76) {
            return i14 == 84 || i10 == 2;
        }
        return false;
    }

    @Override // io.odeeo.internal.b.g.a
    /* renamed from: fromBundle */
    public io.odeeo.internal.b.g mo3834fromBundle(Bundle bundle) {
        switch (this.f68988b) {
            case 6:
                return io.odeeo.internal.b0.a.a(bundle);
            default:
                return a.C0591a.a(bundle);
        }
    }

    @Override // ko.t
    public Constructor getConstructor() {
        switch (this.f68988b) {
            case 15:
                int[] iArr = ko.u.f71767t;
                if (Boolean.TRUE.equals(Class.forName("io.bidmachine.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("io.bidmachine.media3.decoder.flac.FlacExtractor").asSubclass(ko.z.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                int[] iArr2 = ko.u.f71767t;
                return Class.forName("io.bidmachine.media3.decoder.midi.MidiExtractor").asSubclass(ko.z.class).getConstructor(null);
        }
    }

    @Override // io.odeeo.internal.q0.o.b
    public void invoke(Object obj, io.odeeo.internal.q0.l lVar) {
        io.odeeo.internal.c.a.a((io.odeeo.internal.c.b) obj, lVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // li.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parse(android.util.JsonReader r9) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.u.parse(android.util.JsonReader):java.lang.Object");
    }

    @Override // sd.c
    public Object shouldRetry(Object obj, Object obj2) {
        kd.b bVar = (kd.b) obj;
        kd.c cVar = (kd.c) obj2;
        URL url = cVar.f70813b;
        if (url == null) {
            return null;
        }
        rd.a.d("CctTransportBackend", "Following redirect to: %s", url);
        return new kd.b(cVar.f70813b, bVar.f70810b, bVar.f70811c);
    }
}
