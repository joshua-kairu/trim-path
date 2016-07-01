package com.jlt.trimpath;


import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

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

    private AnimatedVectorDrawableCompat

    mUnwritingAnimatedVectorDrawable; // the animated vector which will draw the unwriting

    /* Image Buttons */

    @Bind( R.id.am_ib_write )
    ImageButton mWriteButton; // button to do the writing
    @Bind( R.id.am_ib_unwrite )
    ImageButton mUnwriteButton; // button to do the unwriting
    @Bind( R.id.am_ib_clear )
    ImageButton mClearButton; // button to clear the everything

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
        // 3. enable only the start button

        // 0. super things

        super.onCreate( savedInstanceState );

        // 1. use the main activity layout

        setContentView( R.layout.activity_main );

        // 2. bind views

        ButterKnife.bind( this );

        // 3. enable only the start button

        mWriteButton.setEnabled( true );
        mUnwriteButton.setEnabled( false );
        mClearButton.setEnabled( false );

    } // end onCreate

    /**
     * Other Methods
     */

    // begin method onFrameLayoutClick
    public void onFrameLayoutClick( View view ) {

    } // end method onFrameLayoutClick

    @OnClick( R.id.am_ib_write )
    // begin method onWriteButtonClick
    void onWriteButtonClick( View view ) {

        // 0. put the animated vector within the image
        // 1. disable the other buttons
        // 2. start the writing animation
        // 3. when the animation finishes,
        // 3a. enable the other buttons

        // 0. put the animated vector within the image

        AnimatedVectorDrawableCompat writingAnimatedVectorDrawable = AnimatedVectorDrawableCompat.create( this, R.drawable.animated_vector_write_android_design );

        writingImageView.setImageDrawable( writingAnimatedVectorDrawable );

        // 1. disable the other buttons

        mUnwriteButton.setEnabled( false );
        mClearButton.setEnabled( false );

        // 2. start the writing animation

        writingAnimatedVectorDrawable.start();

        // 3. when the animation finishes,
        // 3a. enable the other buttons

        mUnwriteButton.setEnabled( true );
        mClearButton.setEnabled( true );

    } // end method onWriteButtonClick

    @OnClick( R.id.am_ib_unwrite )
    // begin method onUnwriteButtonClick
    void onUnwriteButtonClick( View view ) {

        // 0. put the animated vector within the image
        // 1. disable the other buttons
        // 2. start the unwriting animation
        // 3. when the animation finishes,
        // 3a. enable the writing button
        // 3b disable the unwriting button

        // 0. put the animated vector within the image

        AnimatedVectorDrawableCompat unwritingAnimatedVectorDrawable = AnimatedVectorDrawableCompat.create( this, R.drawable.animated_vector_unwrite_android_design );

        writingImageView.setImageDrawable( unwritingAnimatedVectorDrawable );

        // 1. disable the other buttons

        mWriteButton.setEnabled( false );
        mClearButton.setEnabled( false );

        // 2. start the unwriting animation

        unwritingAnimatedVectorDrawable.start();

        // 3. when the animation finishes,
        // 3a. enable the writing button

        mWriteButton.setEnabled( true );

        // 3b disable the unwriting button

        mUnwriteButton.setEnabled( false );

    } // end method onUnwriteButtonClick

    @OnClick( R.id.am_ib_clear )
    // begin method onClearButtonClick
    void onClearButtonClick( View view ) {

        // 0. remove the image
        // 1. enable the write button
        // 2. disable the unwrite button
        // 3. disable the clear button

        // 0. null the image

        writingImageView.setImageDrawable( null );

        // 1. enable the write button

        if ( mWriteButton.isEnabled() == false ) { mWriteButton.setEnabled( true ); }

        // 2. disable the unwrite button

        if ( mUnwriteButton.isEnabled() == true ) { mUnwriteButton.setEnabled( false ); }

        // 3. disable the clear button

        mClearButton.setEnabled( false );

    } // end method onClearButtonClick

} // end activity MainActivity