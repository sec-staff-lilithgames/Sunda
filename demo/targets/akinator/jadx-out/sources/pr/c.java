package pr;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f81805a = {1};

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f81806b = new HashMap(1);

    /* renamed from: c, reason: collision with root package name */
    public static final b f81807c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static boolean f81808d = false;

    public static Set<String> getConnectedHeadsets(Context context) {
        BluetoothProfile bluetoothProfile;
        if (nm.j.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            try {
                if (BluetoothAdapter.getDefaultAdapter() != null) {
                    HashSet hashSet = new HashSet();
                    try {
                        for (Map.Entry entry : f81806b.entrySet()) {
                            if (((Integer) entry.getKey()).equals(1) && (bluetoothProfile = (BluetoothProfile) entry.getValue()) != null) {
                                Iterator<BluetoothDevice> it = bluetoothProfile.getConnectedDevices().iterator();
                                while (it.hasNext()) {
                                    String name = it.next().getName();
                                    if (!TextUtils.isEmpty(name)) {
                                        hashSet.add(name);
                                    }
                                }
                            }
                        }
                        return hashSet;
                    } catch (Exception unused) {
                        return hashSet;
                    }
                }
            } catch (Exception unused2) {
                return null;
            }
        }
        return null;
    }

    public static Boolean isHeadsetConnected(Context context) {
        if (!nm.j.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return null;
        }
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            boolean z10 = true;
            if ((defaultAdapter != null ? defaultAdapter.getProfileConnectionState(1) : -1) != 2) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void register(Context context) {
        BluetoothAdapter defaultAdapter;
        if (context == null || context.getApplicationContext() == null || f81808d || !nm.j.isPermissionGranted(context, "android.permission.BLUETOOTH")) {
            return;
        }
        try {
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        } catch (Exception unused) {
        }
        if (defaultAdapter == null) {
            return;
        }
        defaultAdapter.getProfileProxy(context.getApplicationContext(), f81807c, f81805a[0]);
        f81808d = true;
    }
}
