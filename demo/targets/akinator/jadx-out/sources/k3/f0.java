package k3;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f70164a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f70165b;

    /* renamed from: c, reason: collision with root package name */
    public String f70166c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f70167d;

    /* renamed from: e, reason: collision with root package name */
    public final List f70168e;

    public f0(String str) {
        this.f70168e = Collections.EMPTY_LIST;
        this.f70164a = (String) w3.i.checkNotNull(str);
    }

    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.f70164a.equals(notificationChannel.getGroup())) {
                arrayList.add(new d0(notificationChannel));
            }
        }
        return arrayList;
    }

    public List<d0> getChannels() {
        return this.f70168e;
    }

    public String getDescription() {
        return this.f70166c;
    }

    public String getId() {
        return this.f70164a;
    }

    public CharSequence getName() {
        return this.f70165b;
    }

    public boolean isBlocked() {
        return this.f70167d;
    }

    public e0 toBuilder() {
        return new e0(this.f70164a).setName(this.f70165b).setDescription(this.f70166c);
    }

    public f0(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.EMPTY_LIST);
    }

    public f0(NotificationChannelGroup notificationChannelGroup, List list) {
        this(androidx.appcompat.app.j0.P(notificationChannelGroup));
        this.f70165b = androidx.appcompat.app.j0.U(notificationChannelGroup);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f70166c = e4.q.e(notificationChannelGroup);
        }
        if (i10 >= 28) {
            this.f70167d = e4.q.v(notificationChannelGroup);
            this.f70168e = a(androidx.appcompat.app.j0.E(notificationChannelGroup));
        } else {
            this.f70168e = a(list);
        }
    }
}
