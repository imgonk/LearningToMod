package com.supergonkas.learningtomod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Gonçalo on 27-07-2014.
 */
public class ConfigurationHandler
    {
        public static void Init(File configFile)
        { //it creates the cfg file from the given file
            Configuration configuration= new configuration(configFile);

            try
            {   //trys to load the cfg
                configuration.load();

                //reads it!!!!
                boolean configValue = configuration.get(configuration.CATEGORY_GENERAL,"configValue" , true,"This is an example config value").getBoolean(true)
            }
            catch (Exception e)
            {       //catches an error ,if there is one


            }
            finally
            {
                configuration.save();      //saves the cfg to finnalize
            }

        }
    }
