package nh;

import java.util.Map;
import java.util.SortedMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface dh extends r8 {
    @Override // nh.r8
    /* synthetic */ boolean areEqual();

    @Override // nh.r8
    /* bridge */ /* synthetic */ default Map entriesDiffering() {
        return ((tb) this).entriesDiffering();
    }

    @Override // nh.r8
    SortedMap<Object, q8> entriesDiffering();

    @Override // nh.r8
    /* bridge */ /* synthetic */ default Map entriesInCommon() {
        return ((tb) this).entriesInCommon();
    }

    @Override // nh.r8
    SortedMap<Object, Object> entriesInCommon();

    @Override // nh.r8
    /* bridge */ /* synthetic */ default Map entriesOnlyOnLeft() {
        return ((tb) this).entriesOnlyOnLeft();
    }

    @Override // nh.r8
    SortedMap<Object, Object> entriesOnlyOnLeft();

    @Override // nh.r8
    /* bridge */ /* synthetic */ default Map entriesOnlyOnRight() {
        return ((tb) this).entriesOnlyOnRight();
    }

    @Override // nh.r8
    SortedMap<Object, Object> entriesOnlyOnRight();
}
