package com.modulo7.acoustics;

import com.modulo7.musicstatmodels.representation.Song;

/**
 * Created by asanyal on 8/5/2015.
 *
 * An abstract analyzer for acoustic sources
 * All new acoustic sources must implement this interface
 */
public interface AbstractAcousticsAnalyzer {

    // Acquire the modulo7Song representation
    public Song getSongRepresentation();
}
