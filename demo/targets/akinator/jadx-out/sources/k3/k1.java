package k3;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f70205b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Context f70206c;

    public k1(Context context) {
        this.f70206c = context;
    }

    public static k1 create(Context context) {
        return new k1(context);
    }

    @Deprecated
    public static k1 from(Context context) {
        return create(context);
    }

    public k1 addNextIntent(Intent intent) {
        this.f70205b.add(intent);
        return this;
    }

    public k1 addNextIntentWithParentStack(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f70206c.getPackageManager());
        }
        if (component != null) {
            addParentStack(component);
        }
        addNextIntent(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k1 addParentStack(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof j1 ? ((j1) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = a0.getParentActivityIntent(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f70206c.getPackageManager());
            }
            addParentStack(component);
            addNextIntent(supportParentActivityIntent);
        }
        return this;
    }

    public Intent editIntentAt(int i10) {
        return (Intent) this.f70205b.get(i10);
    }

    @Deprecated
    public Intent getIntent(int i10) {
        return editIntentAt(i10);
    }

    public int getIntentCount() {
        return this.f70205b.size();
    }

    public Intent[] getIntents() {
        ArrayList arrayList = this.f70205b;
        int size = arrayList.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent((Intent) arrayList.get(0)).addFlags(268484608);
            for (int i10 = 1; i10 < size; i10++) {
                intentArr[i10] = new Intent((Intent) arrayList.get(i10));
            }
        }
        return intentArr;
    }

    public PendingIntent getPendingIntent(int i10, int i11) {
        return getPendingIntent(i10, i11, (Bundle) null);
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f70205b.iterator();
    }

    public void startActivities() {
        startActivities(null);
    }

    public PendingIntent getPendingIntent(int i10, int i11, boolean z10) {
        return getPendingIntent(i10, a1.a(i11, z10));
    }

    public void startActivities(Bundle bundle) {
        ArrayList arrayList = this.f70205b;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Context context = this.f70206c;
        if (m3.a.startActivities(context, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public PendingIntent getPendingIntent(int i10, int i11, Bundle bundle) {
        ArrayList arrayList = this.f70205b;
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(this.f70206c, i10, intentArr, i11, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public k1 addParentStack(Class<?> cls) {
        return addParentStack(new ComponentName(this.f70206c, cls));
    }

    public k1 addParentStack(ComponentName componentName) {
        Context context = this.f70206c;
        ArrayList arrayList = this.f70205b;
        int size = arrayList.size();
        try {
            for (Intent parentActivityIntent = a0.getParentActivityIntent(context, componentName); parentActivityIntent != null; parentActivityIntent = a0.getParentActivityIntent(context, parentActivityIntent.getComponent())) {
                arrayList.add(size, parentActivityIntent);
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public PendingIntent getPendingIntent(int i10, int i11, Bundle bundle, boolean z10) {
        return getPendingIntent(i10, a1.a(i11, z10), bundle);
    }
}
