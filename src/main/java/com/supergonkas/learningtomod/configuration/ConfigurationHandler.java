package com.supergonkas.learningtomod.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
    {

        public static void Init(File configFile)
        {
            Configuration configuration = new Configuration(configFile);
            boolean configValue = false;
            try
            {
                configuration.load();


                configValue = configuration.get(configuration.CATEGORY_GENERAL,"configValue" , true,"This is an example config value").getBoolean(true);
            }
            catch (Exception e)
            {

            }
            finally
            {
                configuration.save();
                /* saves the cfg to finnalize */
            }

            System.out.println(configValue);

        }
    }
