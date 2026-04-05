package com.mbridge.msdk.playercommon.exoplayer2.trackselection;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.RendererCapabilities;
import com.mbridge.msdk.playercommon.exoplayer2.RendererConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class MappingTrackSelector extends TrackSelector {
    private MappedTrackInfo currentMappedTrackInfo;

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < rendererCapabilitiesArr.length; i11++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i11];
            for (int i12 = 0; i12 < trackGroup.length; i12++) {
                int iSupportsFormat = rendererCapabilities.supportsFormat(trackGroup.getFormat(i12)) & 7;
                if (iSupportsFormat > i10) {
                    if (iSupportsFormat == 4) {
                        return i11;
                    }
                    length = i11;
                    i10 = iSupportsFormat;
                }
            }
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) throws ExoPlaybackException {
        int[] iArr = new int[trackGroup.length];
        for (int i10 = 0; i10 < trackGroup.length; i10++) {
            iArr[i10] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i10));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) throws ExoPlaybackException {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = rendererCapabilitiesArr[i10].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    public abstract Pair<RendererConfiguration[], TrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2) throws ExoPlaybackException;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray) throws ExoPlaybackException {
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = trackGroupArray.length;
            trackGroupArr[i10] = new TrackGroup[i11];
            iArr2[i10] = new int[i11][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i12 = 0; i12 < trackGroupArray.length; i12++) {
            TrackGroup trackGroup = trackGroupArray.get(i12);
            int iFindRenderer = findRenderer(rendererCapabilitiesArr, trackGroup);
            int[] formatSupport = iFindRenderer == rendererCapabilitiesArr.length ? new int[trackGroup.length] : getFormatSupport(rendererCapabilitiesArr[iFindRenderer], trackGroup);
            int i13 = iArr[iFindRenderer];
            trackGroupArr[iFindRenderer][i13] = trackGroup;
            iArr2[iFindRenderer][i13] = formatSupport;
            iArr[iFindRenderer] = i13 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i14 = 0; i14 < rendererCapabilitiesArr.length; i14++) {
            int i15 = iArr[i14];
            trackGroupArrayArr[i14] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i14], i15));
            iArr2[i14] = (int[][]) Util.nullSafeArrayCopy(iArr2[i14], i15);
            iArr3[i14] = rendererCapabilitiesArr[i14].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], TrackSelection[]> pairSelectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports);
        return new TrackSelectorResult((RendererConfiguration[]) pairSelectTracks.first, (TrackSelection[]) pairSelectTracks.second, mappedTrackInfo);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;

        @Deprecated
        public final int length;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        public MappedTrackInfo(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            int length = iArr.length;
            this.rendererCount = length;
            this.length = length;
        }

        public int getAdaptiveSupport(int i10, int i11, boolean z10) {
            int i12 = this.rendererTrackGroups[i10].get(i11).length;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int trackSupport = getTrackSupport(i10, i11, i14);
                if (trackSupport == 4 || (z10 && trackSupport == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return getAdaptiveSupport(i10, i11, Arrays.copyOf(iArr, i13));
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        
            r1 = r1 + 1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int getRendererSupport(int r8) {
            /*
                r7 = this;
                int[][][] r0 = r7.rendererFormatSupports
                r8 = r0[r8]
                r0 = 0
                r1 = r0
                r2 = r1
            L7:
                int r3 = r8.length
                if (r1 >= r3) goto L28
                r3 = r0
            Lb:
                r4 = r8[r1]
                int r5 = r4.length
                if (r3 >= r5) goto L25
                r4 = r4[r3]
                r4 = r4 & 7
                r5 = 3
                if (r4 == r5) goto L1d
                r6 = 4
                if (r4 == r6) goto L1c
                r4 = 1
                goto L1e
            L1c:
                return r5
            L1d:
                r4 = 2
            L1e:
                int r2 = java.lang.Math.max(r2, r4)
                int r3 = r3 + 1
                goto Lb
            L25:
                int r1 = r1 + 1
                goto L7
            L28:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.trackselection.MappingTrackSelector.MappedTrackInfo.getRendererSupport(int):int");
        }

        public int getRendererType(int i10) {
            return this.rendererTrackTypes[i10];
        }

        @Deprecated
        public int getTrackFormatSupport(int i10, int i11, int i12) {
            return getTrackSupport(i10, i11, i12);
        }

        public TrackGroupArray getTrackGroups(int i10) {
            return this.rendererTrackGroups[i10];
        }

        public int getTrackSupport(int i10, int i11, int i12) {
            return this.rendererFormatSupports[i10][i11][i12] & 7;
        }

        @Deprecated
        public int getTrackTypeRendererSupport(int i10) {
            return getTypeSupport(i10);
        }

        public int getTypeSupport(int i10) {
            int iMax = 0;
            for (int i11 = 0; i11 < this.rendererCount; i11++) {
                if (this.rendererTrackTypes[i11] == i10) {
                    iMax = Math.max(iMax, getRendererSupport(i11));
                }
            }
            return iMax;
        }

        @Deprecated
        public TrackGroupArray getUnassociatedTrackGroups() {
            return getUnmappedTrackGroups();
        }

        public TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public int getAdaptiveSupport(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int iMin = 16;
            String str = null;
            boolean z10 = false;
            int i13 = 0;
            while (i12 < iArr.length) {
                String str2 = this.rendererTrackGroups[i10].get(i11).getFormat(iArr[i12]).sampleMimeType;
                int i14 = i13 + 1;
                if (i13 == 0) {
                    str = str2;
                } else {
                    z10 |= !Util.areEqual(str, str2);
                }
                iMin = Math.min(iMin, this.rendererFormatSupports[i10][i11][i12] & 24);
                i12++;
                i13 = i14;
            }
            return z10 ? Math.min(iMin, this.rendererMixedMimeTypeAdaptiveSupports[i10]) : iMin;
        }
    }
}
