package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import a.b;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ChunkIndex;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.text.cea.CeaUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FragmentedMp4Extractor implements Extractor {
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    private static final int FLAG_SIDELOADED = 8;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";
    private final TrackOutput additionalEmsgTrackOutput;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] cea608TrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private TrackBundle currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final byte[] extendedTypeScratch;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private long segmentIndexEarliestPresentationTimeUs;
    private final DrmInitData sideloadedDrmInitData;
    private final Track sideloadedTrack;
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<TrackBundle> trackBundles;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.FragmentedMp4Extractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new FragmentedMp4Extractor()};
        }
    };
    private static final int SAMPLE_GROUP_TYPE_seig = Util.getIntegerCodeForString("seig");
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format EMSG_FORMAT = Format.createSampleFormat(null, MimeTypes.APPLICATION_EMSG, Long.MAX_VALUE);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class MetadataSampleInfo {
        public final long presentationTimeDeltaUs;
        public final int size;

        public MetadataSampleInfo(long j10, int i10) {
            this.presentationTimeDeltaUs = j10;
            this.size = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class TrackBundle {
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        public DefaultSampleValues defaultSampleValues;
        public int firstSampleToOutputIndex;
        public final TrackOutput output;
        public Track track;
        public final TrackFragment fragment = new TrackFragment();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public TrackBundle(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        private TrackEncryptionBox getEncryptionBox() {
            TrackFragment trackFragment = this.fragment;
            int i10 = trackFragment.header.sampleDescriptionIndex;
            TrackEncryptionBox trackEncryptionBox = trackFragment.trackEncryptionBox;
            return trackEncryptionBox != null ? trackEncryptionBox : this.track.getSampleDescriptionEncryptionBox(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void skipSampleEncryptionData() {
            TrackFragment trackFragment = this.fragment;
            if (trackFragment.definesEncryptionData) {
                ParsableByteArray parsableByteArray = trackFragment.sampleEncryptionData;
                int i10 = getEncryptionBox().initializationVectorSize;
                if (i10 != 0) {
                    parsableByteArray.skipBytes(i10);
                }
                if (this.fragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex]) {
                    parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
                }
            }
        }

        public void init(Track track, DefaultSampleValues defaultSampleValues) {
            this.track = (Track) Assertions.checkNotNull(track);
            this.defaultSampleValues = (DefaultSampleValues) Assertions.checkNotNull(defaultSampleValues);
            this.output.format(track.format);
            reset();
        }

        public boolean next() {
            this.currentSampleIndex++;
            int i10 = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i10;
            int[] iArr = this.fragment.trunLength;
            int i11 = this.currentTrackRunIndex;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.currentTrackRunIndex = i11 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public int outputSampleEncryptionData() {
            ParsableByteArray parsableByteArray;
            if (!this.fragment.definesEncryptionData) {
                return 0;
            }
            TrackEncryptionBox encryptionBox = getEncryptionBox();
            int length = encryptionBox.initializationVectorSize;
            if (length != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = encryptionBox.defaultInitializationVector;
                this.defaultInitializationVector.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean z10 = this.fragment.sampleHasSubsampleEncryptionTable[this.currentSampleIndex];
            ParsableByteArray parsableByteArray3 = this.encryptionSignalByte;
            parsableByteArray3.data[0] = (byte) ((z10 ? 128 : 0) | length);
            parsableByteArray3.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1);
            this.output.sampleData(parsableByteArray, length);
            if (!z10) {
                return length + 1;
            }
            ParsableByteArray parsableByteArray4 = this.fragment.sampleEncryptionData;
            int unsignedShort = parsableByteArray4.readUnsignedShort();
            parsableByteArray4.skipBytes(-2);
            int i10 = (unsignedShort * 6) + 2;
            this.output.sampleData(parsableByteArray4, i10);
            return length + 1 + i10;
        }

        public void reset() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
        }

        public void seek(long j10) {
            long jUsToMs = C.usToMs(j10);
            int i10 = this.currentSampleIndex;
            while (true) {
                TrackFragment trackFragment = this.fragment;
                if (i10 >= trackFragment.sampleCount || trackFragment.getSamplePresentationTime(i10) >= jUsToMs) {
                    return;
                }
                if (this.fragment.sampleIsSyncFrameTable[i10]) {
                    this.firstSampleToOutputIndex = i10;
                }
                i10++;
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.track.getSampleDescriptionEncryptionBox(this.fragment.header.sampleDescriptionIndex);
            this.output.format(this.track.format.copyWithDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)));
        }
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : (DefaultSampleValues) Assertions.checkNotNull(sparseArray.get(i10));
    }

    private static DrmInitData getDrmInitDataFromAtoms(List<Atom.LeafAtom> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            Atom.LeafAtom leafAtom = list.get(i10);
            if (leafAtom.type == Atom.TYPE_pssh) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = leafAtom.data.data;
                UUID uuid = PsshAtomUtil.parseUuid(bArr);
                if (uuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, MimeTypes.VIDEO_MP4, bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private static TrackBundle getNextFragmentRun(SparseArray<TrackBundle> sparseArray) {
        int size = sparseArray.size();
        TrackBundle trackBundle = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            TrackBundle trackBundleValueAt = sparseArray.valueAt(i10);
            int i11 = trackBundleValueAt.currentTrackRunIndex;
            TrackFragment trackFragment = trackBundleValueAt.fragment;
            if (i11 != trackFragment.trunCount) {
                long j11 = trackFragment.trunDataPosition[i11];
                if (j11 < j10) {
                    trackBundle = trackBundleValueAt;
                    j10 = j11;
                }
            }
        }
        return trackBundle;
    }

    private static TrackBundle getTrackBundle(SparseArray<TrackBundle> sparseArray, int i10) {
        return sparseArray.size() == 1 ? sparseArray.valueAt(0) : sparseArray.get(i10);
    }

    private void maybeInitExtraTracks() {
        int i10;
        if (this.emsgTrackOutputs == null) {
            TrackOutput[] trackOutputArr = new TrackOutput[2];
            this.emsgTrackOutputs = trackOutputArr;
            TrackOutput trackOutput = this.additionalEmsgTrackOutput;
            if (trackOutput != null) {
                trackOutputArr[0] = trackOutput;
                i10 = 1;
            } else {
                i10 = 0;
            }
            if ((this.flags & 4) != 0) {
                trackOutputArr[i10] = this.extractorOutput.track(this.trackBundles.size(), 4);
                i10++;
            }
            TrackOutput[] trackOutputArr2 = (TrackOutput[]) Arrays.copyOf(this.emsgTrackOutputs, i10);
            this.emsgTrackOutputs = trackOutputArr2;
            for (TrackOutput trackOutput2 : trackOutputArr2) {
                trackOutput2.format(EMSG_FORMAT);
            }
        }
        if (this.cea608TrackOutputs == null) {
            this.cea608TrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
            for (int i11 = 0; i11 < this.cea608TrackOutputs.length; i11++) {
                TrackOutput trackOutputTrack = this.extractorOutput.track(this.trackBundles.size() + 1 + i11, 3);
                trackOutputTrack.format(this.closedCaptionFormats.get(i11));
                this.cea608TrackOutputs[i11] = trackOutputTrack;
            }
        }
    }

    private void onContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        int i10 = containerAtom.type;
        if (i10 == Atom.TYPE_moov) {
            onMoovContainerAtomRead(containerAtom);
        } else if (i10 == Atom.TYPE_moof) {
            onMoofContainerAtomRead(containerAtom);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(containerAtom);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        TrackOutput[] trackOutputArr = this.emsgTrackOutputs;
        if (trackOutputArr == null || trackOutputArr.length == 0) {
            return;
        }
        parsableByteArray.setPosition(12);
        int iBytesLeft = parsableByteArray.bytesLeft();
        parsableByteArray.readNullTerminatedString();
        parsableByteArray.readNullTerminatedString();
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, parsableByteArray.readUnsignedInt());
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray.setPosition(12);
            trackOutput.sampleData(parsableByteArray, iBytesLeft);
        }
        long j10 = this.segmentIndexEarliestPresentationTimeUs;
        if (j10 == C.TIME_UNSET) {
            this.pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(jScaleLargeTimestamp, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        long jAdjustSampleTimestamp = j10 + jScaleLargeTimestamp;
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        long j11 = jAdjustSampleTimestamp;
        for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(j11, 1, iBytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(Atom.LeafAtom leafAtom, long j10) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(leafAtom);
            return;
        }
        int i10 = leafAtom.type;
        if (i10 != Atom.TYPE_sidx) {
            if (i10 == Atom.TYPE_emsg) {
                onEmsgLeafAtomRead(leafAtom.data);
            }
        } else {
            Pair<Long, ChunkIndex> sidx = parseSidx(leafAtom.data, j10);
            this.segmentIndexEarliestPresentationTimeUs = ((Long) sidx.first).longValue();
            this.extractorOutput.seekMap((SeekMap) sidx.second);
            this.haveOutputSeekMap = true;
        }
    }

    private void onMoofContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        parseMoof(containerAtom, this.trackBundles, this.flags, this.extendedTypeScratch);
        DrmInitData drmInitDataFromAtoms = this.sideloadedDrmInitData != null ? null : getDrmInitDataFromAtoms(containerAtom.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.trackBundles.valueAt(i10).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != C.TIME_UNSET) {
            int size2 = this.trackBundles.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.trackBundles.valueAt(i11).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = C.TIME_UNSET;
        }
    }

    private void onMoovContainerAtomRead(Atom.ContainerAtom containerAtom) throws ParserException {
        int i10 = 0;
        Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = this.sideloadedDrmInitData;
        if (drmInitDataFromAtoms == null) {
            drmInitDataFromAtoms = getDrmInitDataFromAtoms(containerAtom.leafChildren);
        }
        DrmInitData drmInitData = drmInitDataFromAtoms;
        Atom.ContainerAtom containerAtomOfType = containerAtom.getContainerAtomOfType(Atom.TYPE_mvex);
        SparseArray<DefaultSampleValues> sparseArray = new SparseArray<>();
        int size = containerAtomOfType.leafChildren.size();
        long mehd = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            Atom.LeafAtom leafAtom = containerAtomOfType.leafChildren.get(i11);
            int i12 = leafAtom.type;
            if (i12 == Atom.TYPE_trex) {
                Pair<Integer, DefaultSampleValues> trex = parseTrex(leafAtom.data);
                sparseArray.put(((Integer) trex.first).intValue(), (DefaultSampleValues) trex.second);
            } else if (i12 == Atom.TYPE_mehd) {
                mehd = parseMehd(leafAtom.data);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = containerAtom.containerChildren.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i13);
            if (containerAtom2.type == Atom.TYPE_trak) {
                Track trak = AtomParsers.parseTrak(containerAtom2, containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd), mehd, drmInitData, (this.flags & 16) != 0, false);
                if (trak != null) {
                    sparseArray2.put(trak.f42163id, trak);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.trackBundles.size() != 0) {
            Assertions.checkState(this.trackBundles.size() == size3);
            while (i10 < size3) {
                Track track = (Track) sparseArray2.valueAt(i10);
                this.trackBundles.get(track.f42163id).init(track, getDefaultSampleValues(sparseArray, track.f42163id));
                i10++;
            }
            return;
        }
        while (i10 < size3) {
            Track track2 = (Track) sparseArray2.valueAt(i10);
            TrackBundle trackBundle = new TrackBundle(this.extractorOutput.track(i10, track2.type));
            trackBundle.init(track2, getDefaultSampleValues(sparseArray, track2.f42163id));
            this.trackBundles.put(track2.f42163id, trackBundle);
            this.durationUs = Math.max(this.durationUs, track2.durationUs);
            i10++;
        }
        maybeInitExtraTracks();
        this.extractorOutput.endTracks();
    }

    private void outputPendingMetadataSamples(long j10) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            MetadataSampleInfo metadataSampleInfoRemoveFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= metadataSampleInfoRemoveFirst.size;
            long jAdjustSampleTimestamp = metadataSampleInfoRemoveFirst.presentationTimeDeltaUs + j10;
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            long j11 = jAdjustSampleTimestamp;
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(j11, 1, metadataSampleInfoRemoveFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(Atom.ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, int i10, byte[] bArr) throws ParserException {
        int size = containerAtom.containerChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i11);
            if (containerAtom2.type == Atom.TYPE_traf) {
                parseTraf(containerAtom2, sparseArray, i10, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(8);
        int i10 = parsableByteArray.readInt();
        if ((Atom.parseFullAtomFlags(i10) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt != 1) {
            throw new ParserException(b.e(unsignedIntToInt, "Unexpected saio entry count: "));
        }
        trackFragment.auxiliaryDataPosition += Atom.parseFullAtomVersion(i10) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        int i10;
        int i11 = trackEncryptionBox.initializationVectorSize;
        parsableByteArray.setPosition(8);
        if ((Atom.parseFullAtomFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt != trackFragment.sampleCount) {
            StringBuilder sbT = o2.t(unsignedIntToInt, "Length mismatch: ", ", ");
            sbT.append(trackFragment.sampleCount);
            throw new ParserException(sbT.toString());
        }
        if (unsignedByte == 0) {
            boolean[] zArr = trackFragment.sampleHasSubsampleEncryptionTable;
            i10 = 0;
            for (int i12 = 0; i12 < unsignedIntToInt; i12++) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                i10 += unsignedByte2;
                zArr[i12] = unsignedByte2 > i11;
            }
        } else {
            i10 = unsignedByte * unsignedIntToInt;
            Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, unsignedByte > i11);
        }
        trackFragment.initEncryptionData(i10);
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, TrackFragment trackFragment) throws ParserException {
        parseSenc(parsableByteArray, 0, trackFragment);
    }

    private static void parseSgpd(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, String str, TrackFragment trackFragment) throws ParserException {
        byte[] bArr;
        parsableByteArray.setPosition(8);
        int i10 = parsableByteArray.readInt();
        int i11 = parsableByteArray.readInt();
        int i12 = SAMPLE_GROUP_TYPE_seig;
        if (i11 != i12) {
            return;
        }
        if (Atom.parseFullAtomVersion(i10) == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw new ParserException("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int i13 = parsableByteArray2.readInt();
        if (parsableByteArray2.readInt() != i12) {
            return;
        }
        int fullAtomVersion = Atom.parseFullAtomVersion(i13);
        if (fullAtomVersion == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw new ParserException("Variable length description in sgpd found (unsupported)");
            }
        } else if (fullAtomVersion >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw new ParserException("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int i14 = (unsignedByte & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i15 = unsignedByte & 15;
        boolean z10 = parsableByteArray2.readUnsignedByte() == 1;
        if (z10) {
            int unsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (z10 && unsignedByte2 == 0) {
                int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, unsignedByte3);
            } else {
                bArr = null;
            }
            byte[] bArr3 = bArr;
            trackFragment.definesEncryptionData = true;
            trackFragment.trackEncryptionBox = new TrackEncryptionBox(z10, str, unsignedByte2, bArr2, i14, i15, bArr3);
        }
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j10) throws ParserException {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = Atom.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (fullAtomVersion == 0) {
            unsignedLongToLong = parsableByteArray.readUnsignedInt();
            unsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            unsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j11 = unsignedLongToLong2 + j10;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
        parsableByteArray.skipBytes(2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j12 = j11;
        long jScaleLargeTimestamp2 = jScaleLargeTimestamp;
        int i10 = 0;
        while (i10 < unsignedShort) {
            int i11 = parsableByteArray.readInt();
            if ((Integer.MIN_VALUE & i11) != 0) {
                throw new ParserException("Unhandled indirect reference");
            }
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i10] = i11 & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = jScaleLargeTimestamp2;
            unsignedLongToLong += unsignedInt2;
            long[] jArr4 = jArr3;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(unsignedLongToLong, 1000000L, unsignedInt);
            jArr2[i10] = jScaleLargeTimestamp2 - jArr4[i10];
            parsableByteArray.skipBytes(4);
            j12 += iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return Atom.parseFullAtomVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    private static TrackBundle parseTfhd(ParsableByteArray parsableByteArray, SparseArray<TrackBundle> sparseArray) {
        parsableByteArray.setPosition(8);
        int fullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        TrackBundle trackBundle = getTrackBundle(sparseArray, parsableByteArray.readInt());
        if (trackBundle == null) {
            return null;
        }
        if ((fullAtomFlags & 1) != 0) {
            long unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            TrackFragment trackFragment = trackBundle.fragment;
            trackFragment.dataPosition = unsignedLongToLong;
            trackFragment.auxiliaryDataPosition = unsignedLongToLong;
        }
        DefaultSampleValues defaultSampleValues = trackBundle.defaultSampleValues;
        trackBundle.fragment.header = new DefaultSampleValues((fullAtomFlags & 2) != 0 ? parsableByteArray.readUnsignedIntToInt() - 1 : defaultSampleValues.sampleDescriptionIndex, (fullAtomFlags & 8) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.duration, (fullAtomFlags & 16) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.size, (fullAtomFlags & 32) != 0 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.flags);
        return trackBundle;
    }

    private static void parseTraf(Atom.ContainerAtom containerAtom, SparseArray<TrackBundle> sparseArray, int i10, byte[] bArr) throws ParserException {
        TrackBundle tfhd = parseTfhd(containerAtom.getLeafAtomOfType(Atom.TYPE_tfhd).data, sparseArray);
        if (tfhd == null) {
            return;
        }
        TrackFragment trackFragment = tfhd.fragment;
        long tfdt = trackFragment.nextFragmentDecodeTime;
        tfhd.reset();
        int i11 = Atom.TYPE_tfdt;
        if (containerAtom.getLeafAtomOfType(i11) != null && (i10 & 2) == 0) {
            tfdt = parseTfdt(containerAtom.getLeafAtomOfType(i11).data);
        }
        parseTruns(containerAtom, tfhd, tfdt, i10);
        TrackEncryptionBox sampleDescriptionEncryptionBox = tfhd.track.getSampleDescriptionEncryptionBox(trackFragment.header.sampleDescriptionIndex);
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_saiz);
        if (leafAtomOfType != null) {
            parseSaiz(sampleDescriptionEncryptionBox, leafAtomOfType.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType2 = containerAtom.getLeafAtomOfType(Atom.TYPE_saio);
        if (leafAtomOfType2 != null) {
            parseSaio(leafAtomOfType2.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType3 = containerAtom.getLeafAtomOfType(Atom.TYPE_senc);
        if (leafAtomOfType3 != null) {
            parseSenc(leafAtomOfType3.data, trackFragment);
        }
        Atom.LeafAtom leafAtomOfType4 = containerAtom.getLeafAtomOfType(Atom.TYPE_sbgp);
        Atom.LeafAtom leafAtomOfType5 = containerAtom.getLeafAtomOfType(Atom.TYPE_sgpd);
        if (leafAtomOfType4 != null && leafAtomOfType5 != null) {
            parseSgpd(leafAtomOfType4.data, leafAtomOfType5.data, sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null, trackFragment);
        }
        int size = containerAtom.leafChildren.size();
        for (int i12 = 0; i12 < size; i12++) {
            Atom.LeafAtom leafAtom = containerAtom.leafChildren.get(i12);
            if (leafAtom.type == Atom.TYPE_uuid) {
                parseUuid(leafAtom.data, trackFragment, bArr);
            }
        }
    }

    private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new DefaultSampleValues(parsableByteArray.readUnsignedIntToInt() - 1, parsableByteArray.readUnsignedIntToInt(), parsableByteArray.readUnsignedIntToInt(), parsableByteArray.readInt()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[]] */
    private static int parseTrun(TrackBundle trackBundle, int i10, long j10, int i11, ParsableByteArray parsableByteArray, int i12) {
        ?? r27;
        boolean z10;
        long j11;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        parsableByteArray.setPosition(8);
        int fullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        Track track = trackBundle.track;
        TrackFragment trackFragment = trackBundle.fragment;
        DefaultSampleValues defaultSampleValues = trackFragment.header;
        trackFragment.trunLength[i10] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = trackFragment.trunDataPosition;
        long j12 = trackFragment.dataPosition;
        jArr[i10] = j12;
        if ((fullAtomFlags & 1) != 0) {
            jArr[i10] = j12 + parsableByteArray.readInt();
        }
        boolean z12 = (fullAtomFlags & 4) != 0;
        int unsignedIntToInt = defaultSampleValues.flags;
        if (z12) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        }
        boolean z13 = (fullAtomFlags & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
        boolean z14 = (fullAtomFlags & 512) != 0;
        boolean z15 = (fullAtomFlags & 1024) != 0;
        boolean z16 = (fullAtomFlags & 2048) != 0;
        long[] jArr2 = track.editListDurations;
        long jScaleLargeTimestamp = 0;
        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
            r27 = 0;
            z10 = true;
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(track.editListMediaTimes[0], 1000L, track.timescale);
        } else {
            r27 = 0;
            z10 = true;
        }
        int[] iArr = trackFragment.sampleSizeTable;
        ?? r72 = trackFragment.sampleCompositionTimeOffsetTable;
        long[] jArr3 = trackFragment.sampleDecodingTimeTable;
        boolean z17 = z10;
        boolean[] zArr = trackFragment.sampleIsSyncFrameTable;
        boolean z18 = z16;
        boolean z19 = (track.type != 2 || (i11 & 1) == 0) ? r27 : z17;
        int i17 = i12 + trackFragment.trunLength[i10];
        boolean z20 = z12;
        long j13 = track.timescale;
        if (i10 > 0) {
            i13 = i12;
            j11 = trackFragment.nextFragmentDecodeTime;
        } else {
            j11 = j10;
            i13 = i12;
        }
        while (i13 < i17) {
            int unsignedIntToInt2 = z13 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.duration;
            int unsignedIntToInt3 = z14 ? parsableByteArray.readUnsignedIntToInt() : defaultSampleValues.size;
            if (i13 == 0 && z20) {
                z11 = z19;
                i14 = unsignedIntToInt;
            } else if (z15) {
                z11 = z19;
                i14 = parsableByteArray.readInt();
            } else {
                z11 = z19;
                i14 = defaultSampleValues.flags;
            }
            if (z18) {
                i15 = i14;
                i16 = i17;
                r72[i13] = (int) ((parsableByteArray.readInt() * 1000) / j13);
            } else {
                i15 = i14;
                i16 = i17;
                r72[i13] = r27;
            }
            long j14 = j11;
            jArr3[i13] = Util.scaleLargeTimestamp(j11, 1000L, j13) - jScaleLargeTimestamp;
            iArr[i13] = unsignedIntToInt3;
            zArr[i13] = (((i15 >> 16) & 1) != 0 || (z11 && i13 != 0)) ? r27 : z17;
            j11 = j14 + unsignedIntToInt2;
            i13++;
            z19 = z11;
            i17 = i16;
        }
        int i18 = i17;
        trackFragment.nextFragmentDecodeTime = j11;
        return i18;
    }

    private static void parseTruns(Atom.ContainerAtom containerAtom, TrackBundle trackBundle, long j10, int i10) {
        TrackBundle trackBundle2;
        long j11;
        int i11;
        List<Atom.LeafAtom> list = containerAtom.leafChildren;
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            Atom.LeafAtom leafAtom = list.get(i15);
            if (leafAtom.type == Atom.TYPE_trun) {
                ParsableByteArray parsableByteArray = leafAtom.data;
                parsableByteArray.setPosition(12);
                int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i14 += unsignedIntToInt;
                    i13++;
                }
            }
        }
        trackBundle.currentTrackRunIndex = 0;
        trackBundle.currentSampleInTrackRun = 0;
        trackBundle.currentSampleIndex = 0;
        trackBundle.fragment.initTables(i13, i14);
        int i16 = 0;
        int trun = 0;
        while (i12 < size) {
            Atom.LeafAtom leafAtom2 = list.get(i12);
            if (leafAtom2.type == Atom.TYPE_trun) {
                ParsableByteArray parsableByteArray2 = leafAtom2.data;
                trackBundle2 = trackBundle;
                j11 = j10;
                i11 = i10;
                trun = parseTrun(trackBundle2, i16, j11, i11, parsableByteArray2, trun);
                i16++;
            } else {
                trackBundle2 = trackBundle;
                j11 = j10;
                i11 = i10;
            }
            i12++;
            trackBundle = trackBundle2;
            j10 = j11;
            i10 = i11;
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, TrackFragment trackFragment, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, trackFragment);
        }
    }

    private void processAtomEnded(long j10) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j10) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws InterruptedException, IOException {
        int i10 = ((int) this.atomSize) - this.atomHeaderBytesRead;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.data, 8, i10);
            onLeafAtomRead(new Atom.LeafAtom(this.atomType, this.atomData), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i10);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws InterruptedException, IOException {
        int size = this.trackBundles.size();
        TrackBundle trackBundleValueAt = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            TrackFragment trackFragment = this.trackBundles.valueAt(i10).fragment;
            if (trackFragment.sampleEncryptionDataNeedsFill) {
                long j11 = trackFragment.auxiliaryDataPosition;
                if (j11 < j10) {
                    trackBundleValueAt = this.trackBundles.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (trackBundleValueAt == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j10 - extractorInput.getPosition());
        if (position < 0) {
            throw new ParserException("Offset to encryption data was negative.");
        }
        extractorInput.skipFully(position);
        trackBundleValueAt.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput] */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    private boolean readSample(ExtractorInput extractorInput) throws InterruptedException, IOException {
        ?? r17;
        TrackOutput.CryptoData cryptoData;
        boolean z10;
        int i10;
        int iSampleData;
        int i11 = 4;
        int i12 = 1;
        int i13 = 0;
        if (this.parserState == 3) {
            if (this.currentTrackBundle == null) {
                TrackBundle nextFragmentRun = getNextFragmentRun(this.trackBundles);
                if (nextFragmentRun == null) {
                    int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                    if (position < 0) {
                        throw new ParserException("Offset to end of mdat was negative.");
                    }
                    extractorInput.skipFully(position);
                    enterReadingAtomHeaderState();
                    return false;
                }
                int position2 = (int) (nextFragmentRun.fragment.trunDataPosition[nextFragmentRun.currentTrackRunIndex] - extractorInput.getPosition());
                if (position2 < 0) {
                    Log.w(TAG, "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                extractorInput.skipFully(position2);
                this.currentTrackBundle = nextFragmentRun;
            }
            TrackBundle trackBundle = this.currentTrackBundle;
            int[] iArr = trackBundle.fragment.sampleSizeTable;
            int i14 = trackBundle.currentSampleIndex;
            int i15 = iArr[i14];
            this.sampleSize = i15;
            if (i14 < trackBundle.firstSampleToOutputIndex) {
                extractorInput.skipFully(i15);
                this.currentTrackBundle.skipSampleEncryptionData();
                if (!this.currentTrackBundle.next()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (trackBundle.track.sampleTransformation == 1) {
                this.sampleSize = i15 - 8;
                extractorInput.skipFully(8);
            }
            int iOutputSampleEncryptionData = this.currentTrackBundle.outputSampleEncryptionData();
            this.sampleBytesWritten = iOutputSampleEncryptionData;
            this.sampleSize += iOutputSampleEncryptionData;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        TrackBundle trackBundle2 = this.currentTrackBundle;
        TrackFragment trackFragment = trackBundle2.fragment;
        Track track = trackBundle2.track;
        ?? r10 = trackBundle2.output;
        int i16 = trackBundle2.currentSampleIndex;
        long samplePresentationTime = trackFragment.getSamplePresentationTime(i16) * 1000;
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            samplePresentationTime = timestampAdjuster.adjustSampleTimestamp(samplePresentationTime);
        }
        int i17 = track.nalUnitLengthFieldLength;
        if (i17 == 0) {
            r17 = 1;
            while (true) {
                int i18 = this.sampleBytesWritten;
                int i19 = this.sampleSize;
                if (i18 >= i19) {
                    break;
                }
                this.sampleBytesWritten += r10.sampleData(extractorInput, i19 - i18, false);
            }
        } else {
            byte[] bArr = this.nalPrefix.data;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i20 = i17 + 1;
            int i21 = 4 - i17;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i22 = this.sampleCurrentNalBytesRemaining;
                if (i22 == 0) {
                    extractorInput.readFully(bArr, i21, i20);
                    this.nalPrefix.setPosition(i13);
                    this.sampleCurrentNalBytesRemaining = this.nalPrefix.readUnsignedIntToInt() - i12;
                    this.nalStartCode.setPosition(i13);
                    r10.sampleData(this.nalStartCode, i11);
                    r10.sampleData(this.nalPrefix, i12);
                    this.processSeiNalUnitPayload = (this.cea608TrackOutputs.length <= 0 || !NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, bArr[i11])) ? i13 : i12;
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i21;
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i22);
                        extractorInput.readFully(this.nalBuffer.data, i13, this.sampleCurrentNalBytesRemaining);
                        r10.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        iSampleData = this.sampleCurrentNalBytesRemaining;
                        ParsableByteArray parsableByteArray = this.nalBuffer;
                        int iUnescapeStream = NalUnitUtil.unescapeStream(parsableByteArray.data, parsableByteArray.limit());
                        i10 = i12;
                        this.nalBuffer.setPosition("video/hevc".equals(track.format.sampleMimeType) ? 1 : 0);
                        this.nalBuffer.setLimit(iUnescapeStream);
                        CeaUtil.consume(samplePresentationTime, this.nalBuffer, this.cea608TrackOutputs);
                    } else {
                        i10 = i12;
                        iSampleData = r10.sampleData(extractorInput, i22, i13);
                    }
                    this.sampleBytesWritten += iSampleData;
                    this.sampleCurrentNalBytesRemaining -= iSampleData;
                    i12 = i10;
                    i11 = 4;
                    i13 = 0;
                }
            }
            r17 = i12;
        }
        boolean z11 = trackFragment.sampleIsSyncFrameTable[i16];
        if (trackFragment.definesEncryptionData) {
            ?? r12 = (z11 ? 1 : 0) | AbstractJsonLexerKt.INVALID;
            TrackEncryptionBox sampleDescriptionEncryptionBox = trackFragment.trackEncryptionBox;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = track.getSampleDescriptionEncryptionBox(trackFragment.header.sampleDescriptionIndex);
            }
            cryptoData = sampleDescriptionEncryptionBox.cryptoData;
            z10 = r12;
        } else {
            cryptoData = null;
            z10 = z11;
        }
        r10.sampleMetadata(samplePresentationTime, z10, this.sampleSize, 0, cryptoData);
        outputPendingMetadataSamples(samplePresentationTime);
        if (!this.currentTrackBundle.next()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return r17;
    }

    private static boolean shouldParseContainerAtom(int i10) {
        return i10 == Atom.TYPE_moov || i10 == Atom.TYPE_trak || i10 == Atom.TYPE_mdia || i10 == Atom.TYPE_minf || i10 == Atom.TYPE_stbl || i10 == Atom.TYPE_moof || i10 == Atom.TYPE_traf || i10 == Atom.TYPE_mvex || i10 == Atom.TYPE_edts;
    }

    private static boolean shouldParseLeafAtom(int i10) {
        return i10 == Atom.TYPE_hdlr || i10 == Atom.TYPE_mdhd || i10 == Atom.TYPE_mvhd || i10 == Atom.TYPE_sidx || i10 == Atom.TYPE_stsd || i10 == Atom.TYPE_tfdt || i10 == Atom.TYPE_tfhd || i10 == Atom.TYPE_tkhd || i10 == Atom.TYPE_trex || i10 == Atom.TYPE_trun || i10 == Atom.TYPE_pssh || i10 == Atom.TYPE_saiz || i10 == Atom.TYPE_saio || i10 == Atom.TYPE_senc || i10 == Atom.TYPE_uuid || i10 == Atom.TYPE_sbgp || i10 == Atom.TYPE_sgpd || i10 == Atom.TYPE_elst || i10 == Atom.TYPE_mehd || i10 == Atom.TYPE_emsg;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        Track track = this.sideloadedTrack;
        if (track != null) {
            TrackBundle trackBundle = new TrackBundle(extractorOutput.track(0, track.type));
            trackBundle.init(this.sideloadedTrack, new DefaultSampleValues(0, 0, 0, 0));
            this.trackBundles.put(0, trackBundle);
            maybeInitExtraTracks();
            this.extractorOutput.endTracks();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.parserState;
            if (i10 != 0) {
                if (i10 == 1) {
                    readAtomPayload(extractorInput);
                } else if (i10 == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        int size = this.trackBundles.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.trackBundles.valueAt(i10).reset();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j11;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return Sniffer.sniffFragmented(extractorInput);
    }

    public FragmentedMp4Extractor(int i10) {
        this(i10, null);
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i10, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.setPosition(i10 + 8);
        int fullAtomFlags = Atom.parseFullAtomFlags(parsableByteArray.readInt());
        if ((fullAtomFlags & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (fullAtomFlags & 2) != 0;
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt != trackFragment.sampleCount) {
            StringBuilder sbT = o2.t(unsignedIntToInt, "Length mismatch: ", ", ");
            sbT.append(trackFragment.sampleCount);
            throw new ParserException(sbT.toString());
        }
        Arrays.fill(trackFragment.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, z10);
        trackFragment.initEncryptionData(parsableByteArray.bytesLeft());
        trackFragment.fillEncryptionData(parsableByteArray);
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.data, 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j10 = this.atomSize;
        if (j10 == 1) {
            extractorInput.readFully(this.atomHeader.data, 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j10 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw new ParserException("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - this.atomHeaderBytesRead;
        if (this.atomType == Atom.TYPE_moof) {
            int size = this.trackBundles.size();
            for (int i10 = 0; i10 < size; i10++) {
                TrackFragment trackFragment = this.trackBundles.valueAt(i10).fragment;
                trackFragment.atomPosition = position;
                trackFragment.auxiliaryDataPosition = position;
                trackFragment.dataPosition = position;
            }
        }
        int i11 = this.atomType;
        if (i11 == Atom.TYPE_mdat) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = this.atomSize + position;
            if (!this.haveOutputSeekMap) {
                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
                this.haveOutputSeekMap = true;
            }
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i11)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw new ParserException("Leaf atom defines extended atom size (unsupported).");
            }
            long j11 = this.atomSize;
            if (j11 > 2147483647L) {
                throw new ParserException(GalEuEfxjome.RTSSiuO);
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) j11);
            this.atomData = parsableByteArray;
            System.arraycopy(this.atomHeader.data, 0, parsableByteArray.data, 0, 8);
            this.parserState = 1;
        } else {
            if (this.atomSize > 2147483647L) {
                throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    public FragmentedMp4Extractor(int i10, TimestampAdjuster timestampAdjuster) {
        this(i10, timestampAdjuster, null, null);
    }

    public FragmentedMp4Extractor(int i10, TimestampAdjuster timestampAdjuster, Track track, DrmInitData drmInitData) {
        this(i10, timestampAdjuster, track, drmInitData, Collections.EMPTY_LIST);
    }

    public FragmentedMp4Extractor(int i10, TimestampAdjuster timestampAdjuster, Track track, DrmInitData drmInitData, List<Format> list) {
        this(i10, timestampAdjuster, track, drmInitData, list, null);
    }

    public FragmentedMp4Extractor(int i10, TimestampAdjuster timestampAdjuster, Track track, DrmInitData drmInitData, List<Format> list, TrackOutput trackOutput) {
        this.flags = i10 | (track != null ? 8 : 0);
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.sideloadedDrmInitData = drmInitData;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        this.extendedTypeScratch = new byte[16];
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.durationUs = C.TIME_UNSET;
        this.pendingSeekTimeUs = C.TIME_UNSET;
        this.segmentIndexEarliestPresentationTimeUs = C.TIME_UNSET;
        enterReadingAtomHeaderState();
    }
}
