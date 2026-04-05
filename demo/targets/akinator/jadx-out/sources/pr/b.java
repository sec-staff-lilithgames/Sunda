package pr;

import android.bluetooth.BluetoothProfile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements BluetoothProfile.ServiceListener {
    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
        c.f81806b.put(Integer.valueOf(i10), bluetoothProfile);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i10) {
    }
}
