package x3;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final DragAndDropPermissions f91675a;

    public t(DragAndDropPermissions dragAndDropPermissions) {
        this.f91675a = dragAndDropPermissions;
    }

    public static t request(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions dragAndDropPermissionsRequestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
        if (dragAndDropPermissionsRequestDragAndDropPermissions != null) {
            return new t(dragAndDropPermissionsRequestDragAndDropPermissions);
        }
        return null;
    }

    public void release() {
        this.f91675a.release();
    }
}
