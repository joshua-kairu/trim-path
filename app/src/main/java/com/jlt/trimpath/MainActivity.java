package com.jlt.trimpath;

import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Trim Path
 *
 * Sample app to show how Android trim paths work
 *
 * Copyright (C) 2016 Kairu Joshua Wambugu
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 */

// begin activity MainActivity
public class MainActivity extends AppCompatActivity {

    /** CONSTANTS */

    /** VARIABLES */

    /* Animated Vector Drawable Compats */

    private AnimatedVectorDrawableCompat writingAnimatedVectorDrawable; // the animated vector which will draw the writing

    /* Image Views */

    @Bind( R.id.am_iv )
    ImageView writingImageView; // where we put the writing

    /** METHODS */

    /** Getters and Setters */

    /**
     * Overrides
     */

    @Override
    // begin onCreate
    protected void onCreate( Bundle savedInstanceState ) {

        // 0. super things
        // 1. use the main activity layout
        // 2. bind views
        // 3. initialize the animated vector
        // 4. put the animated vector within the image

        // 0. super things

        super.onCreate( savedInstanceState );

        // 1. use the main activity layout

        setContentView( R.layout.activity_main );

        // 2. bind views

        ButterKnife.bind( this );

        // 3. initialize the animated vector

        writingAnimatedVectorDrawable = AnimatedVectorDrawableCompat.create( this, R.drawable.animated_vector_write_android_design );

        // 4. put the animated vector within the image

        writingImageView.setImageDrawable( writingAnimatedVectorDrawable );

    } // end onCreate

    /**
     * Other Methods
     */

    // begin method onFrameLayoutClick
    public void onFrameLayoutClick( View view ) {

        // 0. start the writing animation

        // 0. start the writing animation

        writingAnimatedVectorDrawable.start();

    } // end method onFrameLayoutClick

} // end activity MainActivity