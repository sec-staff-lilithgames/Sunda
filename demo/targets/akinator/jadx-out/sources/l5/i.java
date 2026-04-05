package l5;

import android.net.Uri;
import android.view.InputEvent;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f72419a;

    /* renamed from: b, reason: collision with root package name */
    public final InputEvent f72420b;

    public i(List<? extends Uri> registrationUris, InputEvent inputEvent) {
        e0.checkNotNullParameter(registrationUris, "registrationUris");
        this.f72419a = registrationUris;
        this.f72420b = inputEvent;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return e0.areEqual(this.f72419a, iVar.f72419a) && e0.areEqual(this.f72420b, iVar.f72420b);
    }

    public final InputEvent getInputEvent() {
        return this.f72420b;
    }

    public final List<Uri> getRegistrationUris() {
        return this.f72419a;
    }

    public int hashCode() {
        int iHashCode = this.f72419a.hashCode();
        InputEvent inputEvent = this.f72420b;
        if (inputEvent == null) {
            return iHashCode;
        }
        return inputEvent.hashCode() + (iHashCode * 31);
    }

    public String toString() {
        return a.b.l("AppSourcesRegistrationRequest { ", "RegistrationUris=[" + this.f72419a + "], InputEvent=" + this.f72420b, " }");
    }

    public /* synthetic */ i(List list, InputEvent inputEvent, int i10, u uVar) {
        this(list, (i10 & 2) != 0 ? null : inputEvent);
    }
}
