package o5;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k0 extends u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f77611b;

    public k0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f77611b = multiInstanceInvalidationService;
    }

    @Override // o5.u, o5.v
    public void broadcastInvalidation(int i10, String[] tables) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tables, "tables");
        RemoteCallbackList<s> callbackList$room_runtime_release = this.f77611b.getCallbackList$room_runtime_release();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f77611b;
        synchronized (callbackList$room_runtime_release) {
            String str = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(Integer.valueOf(i10));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.getCallbackList$room_runtime_release().beginBroadcast();
            for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastCookie(i11);
                    kotlin.jvm.internal.e0.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = multiInstanceInvalidationService.getClientNames$room_runtime_release().get(num);
                    if (i10 != iIntValue && kotlin.jvm.internal.e0.areEqual(str, str2)) {
                        try {
                            ((s) multiInstanceInvalidationService.getCallbackList$room_runtime_release().getBroadcastItem(i11)).onInvalidation(tables);
                        } catch (RemoteException e10) {
                            Log.w("ROOM", "Error invoking a remote callback", e10);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.getCallbackList$room_runtime_release().finishBroadcast();
                }
            }
        }
    }

    @Override // o5.u, o5.v
    public int registerCallback(s callback, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        int i10 = 0;
        if (str == null) {
            return 0;
        }
        RemoteCallbackList<s> callbackList$room_runtime_release = this.f77611b.getCallbackList$room_runtime_release();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f77611b;
        synchronized (callbackList$room_runtime_release) {
            try {
                multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId$room_runtime_release() + 1);
                int maxClientId$room_runtime_release = multiInstanceInvalidationService.getMaxClientId$room_runtime_release();
                if (multiInstanceInvalidationService.getCallbackList$room_runtime_release().register(callback, Integer.valueOf(maxClientId$room_runtime_release))) {
                    multiInstanceInvalidationService.getClientNames$room_runtime_release().put(Integer.valueOf(maxClientId$room_runtime_release), str);
                    i10 = maxClientId$room_runtime_release;
                } else {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId$room_runtime_release() - 1);
                    multiInstanceInvalidationService.getMaxClientId$room_runtime_release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    @Override // o5.u, o5.v
    public void unregisterCallback(s callback, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        RemoteCallbackList<s> callbackList$room_runtime_release = this.f77611b.getCallbackList$room_runtime_release();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f77611b;
        synchronized (callbackList$room_runtime_release) {
            multiInstanceInvalidationService.getCallbackList$room_runtime_release().unregister(callback);
            multiInstanceInvalidationService.getClientNames$room_runtime_release().remove(Integer.valueOf(i10));
        }
    }
}
